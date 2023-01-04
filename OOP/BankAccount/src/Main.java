public class Main {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("1000 2000 3000 4000",1000,"Jhon Doe",
//                "doe.jhon@swamp.com", "+35.754.846.888");
        BankAccount account1 = new BankAccount();

        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getAccountBalance());
//        account1.setAccountNumber("1000 2000 3000 4000");
//        account1.setAccountBalance(0);
//        account1.setCustomerName("Jhon Doe");
//        account1.setEmail("doe.jhon@swamp.com");
//        account1.setPhoneNumber("+35.754.846.888");

        account1.infoAccount();
        account1.depositingFunds();
        account1.withdrawingFunds();
        account1.infoAccount();
        System.out.println(account1.getEmail());
        System.out.println("************************************");
        BankAccount account2 = new BankAccount("Tim","tim@work.uk","15651661666");
        account2.infoAccount();
        System.out.println(account2.getEmail()+" "+account2.getPhoneNumber());
    }
}
