package program;
import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();


        for(int i = 1; i<= 2; i++){
            System.out.print("Enter the length of the side 'a': ");
            double a = sc.nextDouble();
            System.out.print("Enter the length of the side 'b': ");
            double b = sc.nextDouble();
            System.out.print("Enter the length of the side 'c': ");
            double c = sc.nextDouble();
            System.out.println();

            if(i == 1){
              triangleX.setAllSides(a, b, c);
            } else {
                triangleY.setAllSides(a, b, c);
            }

        }

        double areaX = triangleX.calculateArea();
        double areaY = triangleY.calculateArea();
        System.out.printf("Area of Triangle 'X': %.2f%n", areaX);
        System.out.printf("Area of Triangle 'Y': %.2f%n", areaY);

        System.out.println("Larger area: "
                + ((Math.max(areaX, areaY)) == areaX ? "X." : "Y." ));

        sc.close();
    }


}
