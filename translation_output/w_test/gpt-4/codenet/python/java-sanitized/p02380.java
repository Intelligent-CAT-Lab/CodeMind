import java.util.Scanner;
import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        double cInRadians = Math.toRadians(c);
        double sinC = Math.sin(cInRadians);
        double cosC = Math.cos(cInRadians);

        double area = 0.5 * a * b * sinC;
        double length = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*cosC);
        double height = b * sinC;

        System.out.printf("%.8f\n", area);
        System.out.printf("%.8f\n", length);
        System.out.printf("%.8f\n", height);

        scanner.close();
    }
}