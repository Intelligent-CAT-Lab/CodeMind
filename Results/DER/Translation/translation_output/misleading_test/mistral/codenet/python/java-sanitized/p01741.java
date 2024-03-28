import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n / 1 + 1;
        if (Math.pow(2, 0.5) * n < result) {
            result = Math.pow(2, 0.5) * n;
        }
        System.out.println(result);
    }
}