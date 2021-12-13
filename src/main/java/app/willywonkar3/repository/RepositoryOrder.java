
package app.willywonkar3.repository;

import app.willywonkar3.Interface.InterfaceOrder;
import app.willywonkar3.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Developer Yhermi Mejía Sarmiento
 */
@Repository
public class RepositoryOrder {
    
        @Autowired
    private InterfaceOrder orderInterface;

    public List<Order> getAll() {
        return (List<Order>) orderInterface.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderInterface.findById(id);
    }

    public Order createOrder(Order order) {
        return orderInterface.save(order);
    }

    public void updateOrder(Order order) {
        orderInterface.save(order);
    }

    public void deleteOrder(Order order) {
        orderInterface.delete(order);
    }
    
    public Optional<Order> lastUserId(){
        return orderInterface.findTopByOrderByIdDesc();
    }
    
    public List<Order> findByZone(String zona) {
        return orderInterface.findByZone(zona);
    }

}
