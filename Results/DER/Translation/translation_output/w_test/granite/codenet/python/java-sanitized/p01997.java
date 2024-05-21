import java.util.Scanner;

public class p01997 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double result = 4.0/3.0 * Math.PI * Math.pow(B, 3);
        System.out.println(String.format("%.10f", result));
    }
}