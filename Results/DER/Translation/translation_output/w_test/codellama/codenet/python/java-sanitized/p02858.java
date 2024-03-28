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
        } else {
            return gcd(b, a % b);
        }
    }

    public static int pow(int base, int exponent, int modulus) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulus;
        }
        return result;
    }
}