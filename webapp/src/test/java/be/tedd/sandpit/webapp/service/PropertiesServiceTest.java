package be.tedd.sandpit.webapp.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context.xml" })
public class PropertiesServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(PropertiesServiceTest.class);

    @Resource
    private PropertiesService serviceA;

    @Before
    public void before() {
        logger.debug("PropertiesServiceTest.before() called");
    }

    @After
    public void after() {
        logger.debug("PropertiesServiceTest.after() called");
    }


    @Test
    public void testValueA() {
        Assert.assertEquals("Hello there test", serviceA.getValueA());
    }

    @Test
    public void testLoadedValueA() {
        Assert.assertEquals("Hello there loaded", serviceA.getLoadedValueA());
    }

    @Test
    public void testGeneratedValueA() {
        Assert.assertEquals("Hello there generated", serviceA.getGeneratedValueA());
    }

}
