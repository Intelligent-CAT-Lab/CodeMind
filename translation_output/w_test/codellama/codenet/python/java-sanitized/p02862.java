import java.util.Scanner;

public class p02862 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = (x + y) / 3;
        int factX = 1;
        int factY = 1;
        int factN = 1;
        for (int i = 2; i <= n; i++) {
            factX = (factX * i) % MOD;
            factY = (factY * i) % MOD;
            factN = (factN * i) % MOD;
        }
        int c = (factN * modinv(factX, MOD) * modinv(factY, MOD)) % MOD;
        System.out.println(c);
    }

    public static int modinv(int a, int m) {
        int g = gcd(a, m);
        if (g != 1) {
            throw new IllegalArgumentException("modular inverse does not exist");
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