package be.tedd.sandpit.jpa.repository;

import be.tedd.sandpit.jpa.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by doug on 21/11/15.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);

}
