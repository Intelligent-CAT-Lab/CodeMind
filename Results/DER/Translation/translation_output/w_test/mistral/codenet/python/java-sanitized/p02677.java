import java.util.Scanner;
import java.lang.Math;

public class p02677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, H, M;
        String input = sc.nextLine();
        String[] split = input.split(" ");
        A = Integer.parseInt(split[0]);
        B = Integer.parseInt(split[1]);
        H = Integer.parseInt(split[2]);
        M = Integer.parseInt(split[3]);

        double l = (H * 360 / 12) + (M * 30 / 60);
        double s = (M * 360 / 60);
        double ang = Math.abs(l - s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}