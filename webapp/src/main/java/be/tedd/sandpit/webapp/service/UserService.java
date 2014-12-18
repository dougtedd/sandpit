package be.tedd.sandpit.webapp.service;

import be.tedd.sandpit.webapp.model.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

//import javax.transaction.Transactional;

/**
 */
@Service
@DependsOn(value = "liquibase")
@Transactional
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @PersistenceContext
    protected EntityManager em;


    public User createUser(String email, String password, String firstName, String lastName) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        em.persist(user);
        return user;
    }

    public User getUserForId(Integer id) {
        return em.find(User.class, id);
    }

    public User getUserForEmail(String email) {
        return em.createNamedQuery("UserService.getUserForEmail", User.class)
                .setParameter("email", email)
                .getResultList()
                .get(0);
    }

    public int getUserCount() {
        return em.createNamedQuery("UserService.getUserCount", Integer.class).getSingleResult();
    }

}
