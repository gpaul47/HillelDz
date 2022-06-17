import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> Customers = new HashMap<String, String>();
        Customers.put("1", "Paul Hiduk");
        Customers.put("2", "Nilla Hiduk");
        Customers.put("3", "Mark Hiduk");
        Customers.put("4", "Kosty Hiduk");
        Customers.put("5", "Cristina Hiduk");

        System.out.println("Customer name 2:" + " " + Customers.get("1"));

        String removedValue = Customers.remove("5");
        System.out.println("Removed value:" + " " + removedValue);

        System.out.println("Updated HashMap:" + " " + Customers);

    }
}
