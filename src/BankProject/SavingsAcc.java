
package BankProject;
class SavingsAcc extends GeneralInformation {
    double interest;

    public SavingsAcc(int formNumber, String name) {
        super(formNumber, name);
    }

    public void yearlyInterest() {
        interest = .15;
        double totalInterestAmount = getBalance()*interest;
        System.out.println("Your interest rate is :"+interest);
        System.out.println("Your interest money is "+totalInterestAmount);
        depositMoney (totalInterestAmount);
    }
}
