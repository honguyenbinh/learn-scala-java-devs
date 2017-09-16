package s4j.java.chapter12;

@SuppressWarnings("all")
public class Customer implements Comparable<Customer> {

    private final String name;
    private final String address;
    private final ShoppingBasket basket = new ShoppingBasket();

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void add(Item item) {
        basket.add(item);
    }

    public Double total() {
        return basket.value();
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " $ " + total();
    }
}
