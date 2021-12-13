package app.willywonkar3.Interface;

import app.willywonkar3.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Developer Yhermi Mejía Sarmiento
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {

}
