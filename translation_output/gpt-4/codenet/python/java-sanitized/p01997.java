import java.util.Scanner;
import static java.lang.Math.PI;

public class p01997 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for A and B separated by space:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double volume = 4.0 / 3.0 * PI * Math.pow(B, 3);
        
        System.out.printf("%.10f", volume);
        scanner.close();
    }
}