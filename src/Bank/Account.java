package Bank;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Account(){
        this("145498", 0.00, "Default Name", "email@email.com", "1111111111");
    }
    private String phoneNumber;

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

    public String getCustomerName() {
        System.out.println(this.customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addFunds(double amount){
        this.balance += amount;
    }

    public void withdrawFunds(double amount){
        if(this.balance - amount > 0){
            this.balance -= amount;
        }else{
            System.out.println("Insufficient Funds");
        }
    }
}
