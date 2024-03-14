import java.util.Scanner;

public class p02677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double l = (H * 360.0) / 12.0 + (M * 30.0) / 60.0;
        double s = (M * 360.0) / 60.0;
        double ang = Math.abs(l - s);
        double c = A * A + B * B - 2 * B * A * Math.cos(Math.toRadians(ang));
        double r = Math.sqrt(c);

        System.out.println(r);
    }
}