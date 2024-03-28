import java.util.Scanner;

public class p02858 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int T = scanner.nextInt();
        
        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        final int MOD = 1000000007;
        
        long result = modPow(modPow(2, h, MOD) + modPow(2, w, MOD) + modPow(2, gcd(h, w), MOD) - 3, gh * gw, MOD);
        System.out.println(result);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long modPow(long base, long exponent, int mod) {
        long result = 1;
        base = base % mod;
        
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        
        return result;
    }
}