package StrategyPattern;
import DataModels.Order;
/**
 * Interface สำหรับส่วนลด
 */

public interface DiscountStrategy {
    double applyDiscount(Order order);
    
}
