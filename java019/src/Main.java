import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter a number between 1 and 1000: ");
        x = sc.nextInt();

        for(int i = 1; i<=x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }


        sc.close();
    }
}
