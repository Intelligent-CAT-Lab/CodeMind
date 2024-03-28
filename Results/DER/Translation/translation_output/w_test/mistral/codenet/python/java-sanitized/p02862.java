import java.util.Scanner;

public class p02862 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int MOD = 1000000007;
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        int[] fact = new int[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        int factX = fact[x];
        int factY = fact[y];
        int factN = fact[n];
        int c = (factN * modinv(factX, MOD) * modinv(factY, MOD)) % MOD;
        System.out.println(c);
    }

    public static int modinv(int a, int m) {
        int g = gcd(a, m);
        if (g != 1) {
            throw new Exception("modular inverse does not exist");
        }
        return a % m;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}