import java.util.Scanner;

public class p03154 {
    private static final int MOD = 1000000007;
    private static final int listSize = 20000001;
    private static long[] fList = new long[listSize];
    private static long[] fRList = new long[listSize];

    static {
        // Initialize the factorial and inverse factorial arrays.
        fList[0] = 1;
        fRList[0] = 1;
        for (int i = 1; i < listSize; i++) {
            fList[i] = (fList[i - 1] * i) % MOD;
        }

        // Calculate the inverse using Fermat's little theorem.
        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2);
        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }
    }

    private static long pow(long a, int b) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        long ans = (long)k * fList[h+w] * fRList[h+w-k] % MOD;
        ans += (long)(h+w) * k * (k+1) * fList[h+w-1] * fRList[2] * fRList[h+w-k] % MOD;
        ans %= MOD;
        ans += (long)h * w * fList[h+w-2] * (k-1) * k * (k+1) * pow(3, MOD-2) * fRList[h+w-k] % MOD;
        ans %= MOD;

        System.out.println(ans);
    }
}