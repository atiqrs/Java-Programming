package BankProject;

public abstract class GeneralInformation {
    private String accountNumber="202012";
    private final String bankName = "The Mid Dec";
    private String name;
    private double balance = 0.0f;
    GeneralInformation(int formNumber,String name){
        accountNumber = accountNumber+formNumber;
        this.name = name;
        System.out.println("A new account is created!");
    }
    void withdrawMoney (double balance){
        this.balance -= balance;
    }
    void depositMoney (double balance){
        this.balance += balance;
    }
    double getBalance(){
        return balance;
    }
    String getName(){
        return name;
    }
    String getAccountNumber(){
        return accountNumber;
    }
    String getBankName(){
        return bankName;
    }
    public abstract void yearlyInterest();
}
