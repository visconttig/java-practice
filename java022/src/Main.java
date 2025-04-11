import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce a number: ");
        n = sc.nextInt();
        System.out.println(String.format("Factorial of %d: ", n) + getFactorial(n));

    }

    public static int getFactorial(int n){
        int factorial;
        if((n == 0) || (n == 1)){
            factorial = 1;
        } else {
            factorial = (n * getFactorial(n - 1));
        }

        return factorial;
    }


}
