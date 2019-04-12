public class HW{
    public static void main(String[] args){
        Account n = new Account(10000, 4000);
          System.out.println(n.getAccount());
          System.out.println(n.getBalance());
          n.debit(100);
          n.credit(13);
          System.out.println(n);
          n.debit(1000000);
          System.out.println(n);
      }
}
class Account{
    int accountNumber;
    double balance;
    double amount;
    public Account(int p){
        this.accountNumber = p;
    }
    public Account(int x, double y){
        this.accountNumber = x;
        this.balance = y;
    }
    public int getAccount(){
        return accountNumber;
      }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void credit(double amount){
        this.balance=balance+amount;
    }
    public void debit(double amount){
        if (balance >= amount){
            this.balance=balance-amount;
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance.");
        }
    }
    public String toString(){
        return "A/C no:"+accountNumber+", Balance=$"+balance;
    }
}
