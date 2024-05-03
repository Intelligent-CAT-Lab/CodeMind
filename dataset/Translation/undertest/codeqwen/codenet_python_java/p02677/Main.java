import java.util.Scanner;
import java.lang.Math;

public class p02677 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int H = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);

        double l = H*360.0/12 + M*30.0/60;
        double s = M*360.0/60;
        double ang = Math.abs(l-s);
        double c = A*A + B*B -2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}