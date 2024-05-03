import java.util.Scanner;

public class p02862 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

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
            fact[i] = (fact[i - 1] * i) % 1000000007;
        }
        int factX = fact[x];
        int factY = fact[y];
        int factN = fact[n];

        int c = factN * modinv(factX, 1000000007) * modinv(factY, 1000000007);
        c %= 1000000007;
        System.out.println(c);
    }

    public static int modinv(int a, int m) {
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
        if (g != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return x0 % m;
        }
    }
}