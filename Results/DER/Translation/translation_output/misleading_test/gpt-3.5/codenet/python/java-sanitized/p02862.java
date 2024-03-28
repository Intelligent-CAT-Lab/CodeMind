import java.util.Scanner;

public class p02862 {
    
    public static int[] xgcd(int a, int b) {
        int x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            int q = a / b;
            int temp = a;
            a = b;
            b = temp % b;
            temp = x0;
            x0 = x1;
            x1 = temp - q * x1;
            temp = y0;
            y0 = y1;
            y1 = temp - q * y1;
        }
        return new int[]{a, x0, y0};
    }
    
    public static int modinv(int a, int m) throws Exception {
        int[] result = xgcd(a, m);
        int g = result[0];
        int x = result[1];
        int y = result[2];
        if (g != 1) {
            throw new Exception("Modular inverse does not exist");
        } else {
            return x % m;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MOD = (int) Math.pow(10, 9) + 7;

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            System.exit(0);
        }

        int n = (x + y) / 3;
        x -= n;
        y -= n;

        int[] fact = new int[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = (int)(((long)fact[i - 1] * i) % MOD);
        }

        int factX = fact[x];
        int factY = fact[y];
        int factN = fact[n];

        int c = (int)(((long)factN * modinv(factX, MOD) % MOD) * modinv(factY, MOD) % MOD);
        c %= MOD;
        
        System.out.println(c);
    }
}