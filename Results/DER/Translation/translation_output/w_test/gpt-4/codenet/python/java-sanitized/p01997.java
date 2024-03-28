import java.util.Scanner;
import static java.lang.Math.PI;

public class p01997 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble(); // Unused in the calculation
        double B = scanner.nextDouble();
        double volume = (4.0 / 3) * PI * Math.pow(B, 3);

        System.out.printf("%.10f%n", volume);
    }
}