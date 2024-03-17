import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sqrtN = Math.sqrt(n);
        int intN = (int) n;
        double result = sqrtN + intN;
        System.out.printf("%.12f%n", result);
    }
}