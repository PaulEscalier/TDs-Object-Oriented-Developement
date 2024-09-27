public class InterestBearingAccount extends Account {
    double interestRate;
    public InterestBearingAccount(double balance, double interestRate)
    {
        super(balance);
        this.interestRate = interestRate;
    }
    public InterestBearingAccount(double interestRate){
        super();
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    @Override
    public void capitaliseOneYear(){
        if (this instanceof MonthlyInterestAccount) {
            // Apply monthly interest calculation (e.g., compound interest 12 times)
        } else if (this instanceof AnnualInterestAccount) {
            // Apply annual interest calculation (e.g., once a year)
        }
    }

}
