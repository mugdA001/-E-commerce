package ObserverPattern;
import DataModels.Order;
/**
 * Concrete observer: ระบบจัดการคลังสินค้า
 */

public class InventoryService implements OrderObserver{

    @Override
    public void update(Order order) {
        System.out.println("[Inventory Service] Stork has been  update for order: " 
        + order.orderId());
    }
    
}
