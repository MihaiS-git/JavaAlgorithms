public class Customer {
    String name;
    double creditLimit;
    String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public Customer(){
        this("Nobody","nobody@nowhere.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void infoCustomer(){
        System.out.println("Name: " + this.name + "\n" +
                "Credit limit: " + this.creditLimit + "\n" +
                "Email: " + this.emailAddress);
    }

}
