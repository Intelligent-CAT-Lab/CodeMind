import java.util.Scanner;

public class p02399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result1 = (double) a / b;
        double result2 = (double) a % b;
        double result3 = (double) a / b;
        System.out.printf("%.2f %d %f%n", result1, result2, result3);
    }
}