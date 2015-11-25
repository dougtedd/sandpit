package be.tedd.sandpit.jpa.repository;

import be.tedd.sandpit.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Repository based on JPA named queries located in orm.xml and defined locally on the method definition
 */
public interface UserJpaRepository extends JpaRepository<User, Long> {

    // The query for this method is read from orm.xml
    List<User> findByEmail(@Param("email") String email);

    // The query for this method is read from orm.xml
    int countUsers();

    @Query("select u from User u where u.email like :email%")
    List<User> findWhereEmailStartsWith(@Param("email") String email);

    @Query("select u from User u where u.email like :email% order by u.email asc")
    User findFirstWhereEmailStartsWith(@Param("email") String email);

    @Transactional
    @Modifying
    @Query("update User u set u.firstName = ?1 where u.lastName = ?2")
    int setFixedFirstnameFor(String firstName, String lastName);
}
