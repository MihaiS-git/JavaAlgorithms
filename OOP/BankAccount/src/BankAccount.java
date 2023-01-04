import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private Integer accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("65764", 25, "Default name",
                "Default adress", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, Integer accountBalance, String customerName,
                       String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 1500, customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public Integer getAccountBalance(){
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setAccountBalance(Integer accountBalance){
        this.accountBalance=accountBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void infoAccount(){
        System.out.println("Account number: " + accountNumber + "\n" +
                "Account balance: " + accountBalance + "\n" +
                "Customer name: " + customerName + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phoneNumber + "\n");
    }

    public void depositingFunds(){
        System.out.println("Enter the amount you want to deposit: ");
        Scanner input = new Scanner(System.in);
        int depostingAmount = input.nextInt();
        this.accountBalance = this.accountBalance + depostingAmount;
        System.out.println("You have " + accountBalance + " $ in your account");
    }

    public void withdrawingFunds(){
        System.out.println("Enter the amount you want to withdraw");
        Scanner input = new Scanner(System.in);
        int withdrawingAmount = input.nextInt();
        if (withdrawingAmount<=this.accountBalance){
            this.accountBalance=this.accountBalance-withdrawingAmount;
        } else {
            System.out.println("Sorry! Insufficient funds! Youn only have " + this.accountBalance + "$ in your account");
        }
    }
}
