package ObserverPattern;
import DataModels.Order;
/**
 * Interface(Observer): ส่วนสำหรับผู้สังเกตการณ์
 */

public interface OrderObserver {
    void update(Order order);
}
