import java.util.Scanner;
import java.lang.Math;

public class p02677 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        double l = (H * 360 / 12.0) + (M * 30 / 60.0);
        double s = M * 360 / 60.0;
        double ang = Math.abs(l - s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}