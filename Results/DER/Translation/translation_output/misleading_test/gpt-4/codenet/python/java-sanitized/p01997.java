import java.util.Scanner;
import static java.lang.Math.*;

public class p01997 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        scanner.close();

        double result = (4.0 / 3.0) * PI * pow(B, 3);

        // Output the result with the specified format
        System.out.printf("%.10f%n", result);
    }
}