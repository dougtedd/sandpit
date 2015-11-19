package be.tedd.sandpit.common;


import org.junit.Assert;
import org.junit.Test;


/**
 */
public class SimpleBeanTest {

    @Test
    public void testCreate() {
        SimpleBean simpleBean = new SimpleBean();
        Assert.assertNotNull(simpleBean);
        Assert.assertNull(simpleBean.getStr());
    }

}
