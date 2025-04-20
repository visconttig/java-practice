package entities;

public class Account {
    private final String holderId;
    private final String name;
    private String email;
    private double balance;


    public Account(String name, String email){
        holderId = _generateId();
        this.name = name;
        this.email = email;
        balance = 0.0;
    }

    public Account(String name, String email, double balance){
        holderId = _generateId();
        this.name = name;
        this.email = email;
        makeDeposit(balance);
    }


    private String _generateId(){
        return String.valueOf((int)(Math.random() * 1000000));
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public double getBalance(){
        return balance;
    }

    public void setEmail(String email){
        if((!email.equalsIgnoreCase(this.email)) && (!email.isEmpty())){
            this.email = email;
            System.out.printf("Email updated: %s%n", this.email);
        }
    }

    public void makeDeposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.printf("Updated balance: %.2f%n", balance);
        } else {
            throw new Error("The deposit amount must be a positive number.");
        }
    }

    public void withdraw(double amount){
        if((balance - amount >= 0) && (amount > 0)){
            balance -= amount;
            System.out.printf("Updated balance: %.2f%n", balance);
        } else {
            System.out.println("Not enough founds or invalid withdraw amount");
        }
    }

    public void printAccountInfo(){
        System.out.printf("=====Account ID: %s====%nName: %s%nEmail: %s%nBalance: %.2f%n=====%n=====%n",
                holderId, name, email, balance);
    }
}
