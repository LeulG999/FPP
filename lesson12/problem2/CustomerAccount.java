package lesson12.problem2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;
    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }
    public boolean deposit(double amount) {
        if(amount<=0){
            throw new IllegalArgumentException("Amounts can not be below $0");
        }
            balance += amount;
            System.out.println("You have successfully Deposited"+"$"+amount);
            return true;
    }
    public boolean withdraw(double amount) {
        if(amount>balance){
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance");
        }
        if((balance-amount)<100){
            throw new AccountException("Low balance warning! Balance cannot go below $100. ");
        }
            balance -= amount;
           System.out.println("You have successfully Withdraw"+"$"+amount);
           return true;
    }
    public double getBalance() {
        return balance;
    }
}
