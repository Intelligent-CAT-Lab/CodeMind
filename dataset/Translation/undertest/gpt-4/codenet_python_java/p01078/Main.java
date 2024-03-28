import java.util.Scanner;
import java.lang.Math;

public class p01078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        double PI = Math.PI; // Math.PI is a predefined constant in Java's Math class.
        double result = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.printf("%.8f\n", result);
    }
}