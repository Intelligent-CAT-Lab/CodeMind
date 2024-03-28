import java.util.Scanner;
import java.lang.Math;

public class p02677 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double l = H*360.0/12 + M*30.0/60;
        double s = M*360.0/60;
        double ang = Math.abs(l-s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.printf("%.18f", Math.sqrt(c));
    }
}