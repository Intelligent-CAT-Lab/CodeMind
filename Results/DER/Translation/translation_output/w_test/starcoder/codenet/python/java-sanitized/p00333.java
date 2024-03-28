import java.util.*;
public class p00333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();
        int g = gcd(W, H);
        System.out.println(W*H*C/g/g);
    }
    public static int gcd(int a, int b) {
        return b == 0? a : gcd(b, a % b);
    }
}