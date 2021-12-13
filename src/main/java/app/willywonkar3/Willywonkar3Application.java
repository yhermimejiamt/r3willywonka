package app.willywonkar3;

import app.willywonkar3.Interface.InterfaceChocolate;
import app.willywonkar3.Interface.InterfaceOrder;
import app.willywonkar3.Interface.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Willywonkar3Application {

    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceChocolate interfaceChocolate;
    @Autowired
    private InterfaceOrder interfaceOrder;

    public static void main(String[] args) {
        SpringApplication.run(Willywonkar3Application.class, args);
    }

    public void run(String... args) throws Exception {

        interfaceUser.deleteAll();
        interfaceChocolate.deleteAll();
        interfaceOrder.deleteAll();
        

   
    }

}
