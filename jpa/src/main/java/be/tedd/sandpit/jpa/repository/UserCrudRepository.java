package be.tedd.sandpit.jpa.repository;

import be.tedd.sandpit.jpa.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CRUD repository
 */
@Repository
public interface UserCrudRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);

}
