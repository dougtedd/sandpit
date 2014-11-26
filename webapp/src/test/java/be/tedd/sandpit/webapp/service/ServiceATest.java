package be.tedd.sandpit.webapp.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by doug on 26/11/14.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context.xml" })
public class ServiceATest {

    @Resource
    private ServiceA serviceA;

    @Before
    public void before() {
        System.out.println("BEFORE");
    }

    @After
    public void after() {
        System.out.println("AFTER");
    }


    @Test
    public void testValueA() {
        Assert.assertEquals("Hello there", serviceA.getValueA());
    }

}
