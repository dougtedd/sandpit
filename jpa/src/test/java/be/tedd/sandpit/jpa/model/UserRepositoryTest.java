package be.tedd.sandpit.jpa.model;


import be.tedd.sandpit.jpa.Application;
import be.tedd.sandpit.jpa.repository.UserRepository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.ArrayList;
import java.util.List;

/**
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class })
@DatabaseSetup(UserRepositoryTest.DATASET)
//@DatabaseTearDown(type = DatabaseOperation.DELETE_ALL, value = { UserRepositoryTest.DATASET })
@DirtiesContext
public class UserRepositoryTest {

    public static final String DATASET = "classpath:sampleData.xml";

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByLastName() {
        List<User> users = userRepository.findByLastName("Head");

        Assert.assertNotNull(users);
        Assert.assertEquals(1, users.size());
    }

    @Test
    public void testAddANewUser() {
        List<User> users = new ArrayList<>();
        users.add(new User("Jack", "Russel", "wild@dog.com", "WoofWoof"));
        userRepository.save(users);

        int found = 0;
        for (User user : userRepository.findAll()) {
            found++;
        }
        Assert.assertEquals(2, found);
    }

}
