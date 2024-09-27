public class AnnualInterestAccount extends InterestBearingAccount {
    public AnnualInterestAccount(double balance,double annualInterestRate) {
        super(balance,annualInterestRate);
    }
    public AnnualInterestAccount(double annualInterestRate) {
        super(annualInterestRate);
    }
    @Override
    public void capitaliseOneYear(){
        double interest = getBalance() * (getInterestRate()+100)/100;
        credit(interest);
    }
}
