public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. New balance = " + accountBalance);
    }

    public void withdraw(double withdrawAmount){
        if (accountBalance - withdrawAmount < 0){
            System.out.println("Only " + accountBalance + " available. Withdrawal not processed");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + accountBalance);
        }
    }
}
