package app.willywonkar3.repository;

import app.willywonkar3.Interface.InterfaceChocolate;
import app.willywonkar3.model.Chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Developer Yhermi Mejía Sarmiento
 */
@Repository
public class RepositoryChocolate {

    @Autowired
    private InterfaceChocolate chocolateInterface;

    public List<Chocolate> getAll() {
        return chocolateInterface.findAll();
    }

    public Optional<Chocolate> getchocolate(String reference) {
        return chocolateInterface.findById(reference);
    }

    public Chocolate createChocolate(Chocolate chocolate) {
        return chocolateInterface.save(chocolate);
    }

    public void updateChocolate(Chocolate chocolate) {
        chocolateInterface.save(chocolate);
    }

    public void deleteChocolate(Chocolate chocolate) {
        chocolateInterface.delete(chocolate);
    }
}
