import implementations.LinkedListQueue;
import interfaces.AbstractQueue;

public class CoffeeShop {
  private AbstractQueue<Order> orderQueue;

  public CoffeeShop() {
    this.orderQueue = new LinkedListQueue<>();
  }

  public void takeOrder(String customerName, String drink, int sugarLevel) {
    Order order = new Order(customerName, drink, sugarLevel);
    orderQueue.enQueue(order);
    System.out.println(" |Order for " + customerName + " added to queue.");
  }

  public void prepareOrders() {
    while (!orderQueue.isEmpty()) {
      Order order = orderQueue.deQueue();
      System.out.println(" * Preparing order for " + order.getCustomerName() + " - " + order.getDrink() + " with "
          + order.getSugarLevel() + " sugar level.");
      System.out.println("Order for " + order.getCustomerName() + " is ready.");
    }
  }

  public static void main(String[] args) {
    CoffeeShop coffeeShop = new CoffeeShop();
    coffeeShop.takeOrder("Alice", "Cappuccino", 2);
    coffeeShop.takeOrder("Bob", "Latte", 1);
    coffeeShop.takeOrder("Charlie", "Espresso", 0);
    coffeeShop.prepareOrders();
  }
}
