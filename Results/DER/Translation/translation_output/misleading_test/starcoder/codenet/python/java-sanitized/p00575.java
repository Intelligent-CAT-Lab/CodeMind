import java.util.*;
public class p00575 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a = (int) Math.ceil(C / A);
        int s = 7 * A + B;
        int t = C / s;
        int u = C - s * t;
        int v = (int) Math.ceil(u / A);
        int b = 7 * t + (v <= 7? v : 7);
        System.out.println(a > b? b : a);
    }
}