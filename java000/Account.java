public class Account {
  String owner = null;
  double savingsBalance = 0.0;

  public void deposit(double amount){
    if(amount > 0){
      this.savingsBalance += amount;
    } else {
      System.out.println("The amount to deposit should be " +
                                 "greater than zero.");
    }
  }
  
  public void withdraw(double amount){
    if(amount >= this.savingsBalance){
      this.savingsBalance -= amount;
    } else {
      System.out.println("The amount available is not enough " +
                                 "to withdraw that much.");
    }
  }

}