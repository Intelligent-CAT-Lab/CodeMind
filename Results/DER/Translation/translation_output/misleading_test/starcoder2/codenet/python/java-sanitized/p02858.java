import java.util.Scanner;

public class p02858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        int MOD = 1000000007;
        System.out.println(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int pow(int a, int b, int mod) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return pow(a * a % mod, b / 2, mod);
        }
        return a * pow(a, b - 1, mod) % mod;
    }
}