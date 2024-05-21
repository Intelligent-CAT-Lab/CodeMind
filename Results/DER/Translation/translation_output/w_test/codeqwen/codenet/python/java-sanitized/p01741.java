import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n * Math.sqrt(2);
        if (result < n) {
            result = n;
        }
        System.out.printf("%.9f", result);
    }
}