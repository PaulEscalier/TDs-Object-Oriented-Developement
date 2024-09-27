public class MonthlyInterestAccount extends InterestBearingAccount{
    public MonthlyInterestAccount(double balance, double interestRate)
    {
        super(balance, interestRate);
    }
    public MonthlyInterestAccount(double interestRate){
        super(interestRate);
    }
    @Override
    public void capitaliseOneYear(){
        for(int i=0; i<12; i++){
            double interest = getBalance() * (getInterestRate())/100;
            credit(interest);
        }
    }
}
