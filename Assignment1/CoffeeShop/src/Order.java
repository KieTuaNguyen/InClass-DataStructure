public class Order {
  private String customerName;
  private String drink;
  private int sugarLevel;

  public Order(String customerName, String drink, int sugarLevel) {
    this.customerName = customerName;
    this.drink = drink;
    this.sugarLevel = sugarLevel;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getDrink() {
    return drink;
  }

  public int getSugarLevel() {
    return sugarLevel;
  }
}
