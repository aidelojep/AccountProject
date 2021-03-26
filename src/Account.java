public class Account{

    private String name;
    private double balance, deposit;

    public Account(String name, double balance) {
        this.name=name;
        if(balance >0.0)
            this.balance=balance; }

    public void makeDeposit(double deposit){
            if (deposit > 0.0)
                balance = deposit + balance;
        }
    public double getDeposit() {
       return deposit;
    }
    public void newDeposit(double deposit){
            this.deposit=deposit;
            }
    public double getBalance() {
        return balance;
    }
    public String getName(){
        return name;
    }










}