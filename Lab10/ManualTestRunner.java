import java.util.List;

import DataModels.*;
import DecoratorPattern.*;
import FactoryMethodPattern.*;
import ObserverPattern.*;
import StrategyPattern.*;

public class ManualTestRunner {
    public static void main(String[] args) {
        System.out.println("--- E-commerce System Simulation ---");

        //Test 1. setup
        Product laptop = new Product("P001","Laptop",30000.0);
        Product mouse = new Product("P002","Mouse",800.0);
        Order myOrder = new Order("ORD-001",List.of(laptop, mouse), "customer@example.com");

        OrderCalculator calculator = new OrderCalculator();
        ShipmentFactory shipmentFactory = new ShipmentFactory();

        OrderProcessor orderProcessor = new OrderProcessor();
        InventoryService inventory = new InventoryService();
        EmailService emailler = new EmailService();
        orderProcessor.register(inventory);
        orderProcessor.register(emailler);

        System.err.println("\n--- 2.Testing Strategy Pattern ---");
        double originalPrice = myOrder.getTotalPrice();
        System.out.println("Originai Price: " + originalPrice);
        
    }
}
