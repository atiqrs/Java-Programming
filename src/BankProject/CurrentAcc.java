package BankProject;

class CurrentAcc extends GeneralInformation{
    double interest;

    public CurrentAcc(int formNumber, String name) {
        super(formNumber, name);
    }
    
    public void yearlyInterest() {
        interest = .08;
        double totalInterestAmount = getBalance()*interest;
        System.out.println("Your interest rate is :"+interest);
        System.out.println("Your interest money is "+totalInterestAmount);
        depositMoney (totalInterestAmount);
    }
}
