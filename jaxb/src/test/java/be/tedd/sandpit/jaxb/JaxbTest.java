package be.tedd.sandpit.jaxb;


import org.junit.Assert;
import org.junit.Test;


/**
 */
public class JaxbTest {


    @Test
    public void testCreate() {
        SimpleBean simpleBean = new SimpleBean();
        Assert.assertNotNull(simpleBean);
        Assert.assertNull(simpleBean.getStr());
    }

}
