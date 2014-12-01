package be.tedd.sandpit.webapp.model;


import org.junit.Assert;
import org.junit.Test;

import be.tedd.sandpit.common.SimpleBean;

/**
 */
public class ComplexBeanTest {


    @Test
    public void testCreate() {
        ComplexBean complexBean = new ComplexBean();
        Assert.assertNotNull(complexBean);
        Assert.assertNull(complexBean.getStr());
        Assert.assertNull(complexBean.getSimpleBean());

        SimpleBean simpleBean = new SimpleBean();
        complexBean.setSimpleBean(simpleBean);
        complexBean.setStr("123");

        Assert.assertNotNull(complexBean.getSimpleBean());
        Assert.assertEquals("123", complexBean.getStr());
    }

}
