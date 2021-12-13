package app.willywonkar3.Interface;

import app.willywonkar3.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Developer Yhermi Mejía Sarmiento
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    //metodo del crud que calcula el usuario con el ultimo Id
    Optional<User> findTopByOrderByIdDesc();
}
