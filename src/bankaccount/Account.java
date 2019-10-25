package bankaccount;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String emailAddress;
    private String phone;
    
    public Account(String accountNumber, double balance, String name, 
            String address, String phone) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.name = name;
    this.emailAddress = address;
    this.phone = phone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made.  New balance is " + this.balance);
    }
    
    public void withdraw(double withdrawAmount) {
        if(this.balance - withdrawAmount < 0) {
            System.out.println("Only " + this.balance + " amount available.  Withdrawal not processed!");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + "Remaining balance is " + this.balance);
        }
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return emailAddress;
    }

    public void setAddress(String address) {
        this.emailAddress = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
