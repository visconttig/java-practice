package program;
import java.util.Scanner;
import entities.Account;

public class Program {
    public static void main(String[] args){

        Account account1 = new Account("Joao", "joao@outlook.com");
        Account account2 = new Account("Laurel", "laurels@yahoo.com", 225.50);

        account1.printAccountInfo();
        account2.printAccountInfo();
        account1.makeDeposit(325.80);
        account2.withdraw(75.00);
        account1.setEmail("joao.m@outlook.com");
        account1.printAccountInfo();
        account2.printAccountInfo();
    }

}
