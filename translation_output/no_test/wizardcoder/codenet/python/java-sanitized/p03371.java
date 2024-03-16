import java.util.*;

public class p03371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, X, Y;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        System.out.println(Math.min(a, Math.min(b, c)));
    }
}