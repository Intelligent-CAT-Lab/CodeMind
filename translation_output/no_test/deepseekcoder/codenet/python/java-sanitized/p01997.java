import java.util.Scanner;

public class p01997 {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.printf("%.10f", 4.0/3.0*PI*Math.pow(B, 3));
    }
}