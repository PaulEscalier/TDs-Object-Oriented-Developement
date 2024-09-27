public class Main {
    public static void main(String[] args) {
        CheckingAccount vC = new CheckingAccount(1000);
        AnnualInterestAccount vA = new AnnualInterestAccount(1000, 6);
        MonthlyInterestAccount vM = new MonthlyInterestAccount(1000, 0.5);

        Account[] tab = {vC, vA, vM};

        for(Account a : tab) {
            a.annualBalance();
        }
        System.out.println(vA.compareTo(vC));
        System.out.println(vA.compareTo(vM));
        System.out.println(vC.compareTo(vM));


    }

}