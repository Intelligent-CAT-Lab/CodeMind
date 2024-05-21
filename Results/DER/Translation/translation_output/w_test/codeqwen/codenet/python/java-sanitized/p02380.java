import java.util.Scanner;

public class p02380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        double result1 = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double result2 = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)));
        double result3 = b * Math.sin(Math.toRadians(c));

        System.out.printf("%.8f\n", result1);
        System.out.printf("%.8f\n", result2);
        System.out.printf("%.8f\n", result3);
    }
}