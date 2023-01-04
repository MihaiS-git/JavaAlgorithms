public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim",1000,"tim@mail.com");
        customer1.infoCustomer();

        System.out.println("*********************************");
        Customer customer2 = new Customer();
        customer2.infoCustomer();

        System.out.println("*********************************");
        Customer customer3 = new Customer("Joe", "joe@email.com");
        customer3.infoCustomer();

    }
}
