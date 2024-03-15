import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = (n / 1 + 1) < n * Math.sqrt(2) ? n / 1 + 1 : n * Math.sqrt(2);
        System.out.println(result);
    }
}