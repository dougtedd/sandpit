package be.tedd.sandpit.webapp.service;

import be.tedd.sandpit.webapp.model.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context.xml" })
public class UserServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Resource
    private UserService userService;


    @Before
    public void before() throws Exception {
    }

    @Test
    public void testCreateUser() {
        User user = userService.createUser("email", "password", "Lester", "Nygaard");
        assertNotNull(user);
        assertEquals("email", user.getEmail());
        User user2 = userService.getUserForEmail("email");
        assertNotNull(user2);

    }

}
