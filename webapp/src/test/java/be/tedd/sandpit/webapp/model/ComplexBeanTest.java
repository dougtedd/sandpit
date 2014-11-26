package be.tedd.sandpit.webapp.model;


import org.junit.Assert;
import org.junit.Test;

import be.tedd.sandpit.common.SimpleBean;

/**
 */
public class ComplexBeanTest {


    @Test
    public void testCreate() {
        SimpleBean simpleBean = new SimpleBean();
        Assert.assertNotNull(simpleBean);
        Assert.assertNull(simpleBean.getStr());
    }

}
