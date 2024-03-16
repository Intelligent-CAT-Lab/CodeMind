import java.util.Scanner;
import java.lang.Math;

public class p02677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double l = H*360/12 + M*30/60;
        double s = M*360/60;
        double ang = Math.abs(l-s);
        double c = Math.pow(A,2) + Math.pow(B,2) - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}

/2019/2019-09-18/README.md
# 2019-09-18