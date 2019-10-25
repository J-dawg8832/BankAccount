package bankaccount;
import bankAccount.VIPCustomer;

public class BankAccount {

    public static void main(String[] args) {
        Account jasonsAccount = new Account("12345", 0.00, "Jason Music", "myemail@jason.com", "(312) 956-8616");
        System.out.println(jasonsAccount.getName());
        jasonsAccount.deposit(500.89);
        System.out.println(jasonsAccount.getBalance());
        
        System.out.println("*****************************");
        
        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());
        
        VIPCustomer person2 = new VIPCustomer("Jason Music", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        
        VIPCustomer person3 = new VIPCustomer("Marwal Grantham", 100000.00, "debbyryan@gmail.com");
        System.out.println(person3.getName());
    }
    
}
