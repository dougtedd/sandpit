package be.tedd.sandpit.common;


import org.junit.Assert;
import org.junit.Test;


/**
 */
public class SimpleBeanTest {


    @Test
    public void testCreate() {
        System.out.println("Running testCreate");
        SimpleBean simpleBean = new SimpleBean();
        Assert.assertNotNull(simpleBean);
        Assert.assertNull(simpleBean.getStr());
        Assert.assertTrue(1==0);
    }

}
