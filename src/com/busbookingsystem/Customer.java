public class Customer {
    private String name;
    private int age;
    private String phone;

    public Customer(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}