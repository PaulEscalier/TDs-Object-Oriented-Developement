import java.io.Serializable;

public class Account implements Comparable<Account> {
    double balance;
    public Account() {
        balance = 0;
    }
    public Account(double balance) {
        this.balance = roundTo2(balance);
    }
    public double getBalance() {
        return balance;
    }
    private void affect(double balance) {
        this.balance = roundTo2(balance);
    }
    private static double roundTo2(final double pR) {
        double vR = Math.abs(pR);
        int vI = (int) (vR * 1000);
        if (vI % 10 >= 5) vR = vR + 0.01;
        return Math.copySign(((int) (vR * 100)) / 100.0, pR);
    }
    public void debit(double amount) {
        if(amount > balance && amount >=0)
            affect(roundTo2(balance-amount));

    }
    public void credit(double amount) {
        if(amount>0)
            affect(roundTo2(balance+amount));
    }

    public void capitaliseOneYear(){

    }
    public void annualBalance(){
        System.out.print("balance="+balance);
        capitaliseOneYear();
        System.out.println("/ after capitalization, balance="+balance);
    }
    @Override
    public int compareTo(Account obj){
        if(this.balance > ((Account) obj).balance)
            return 1;
        else if(this.balance <((Account) obj).balance)
            return -1;
        return 0;
    }

}
