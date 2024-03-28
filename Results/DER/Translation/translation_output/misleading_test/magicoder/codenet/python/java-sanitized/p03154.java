import java.util.Scanner;

public class p03154 {
    static final long MOD = 1000000007;
    static final int listSize = 20000001;
    static long[] fList = new long[listSize];
    static long[] fRList = new long[listSize];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        fList[0] = 1;
        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2);

        for (int i = 1; i < listSize; i++) {
            fList[i] = (fList[i - 1] * i) % MOD;
        }

        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }

        long ans = k * fList[h + w] * fRList[h + w - k];
        ans += (h + w) * k * (k + 1) * fList[h + w - 1] * fRList[2] * fRList[h + w - k];
        ans %= MOD;
        ans += h * w * fList[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2) * fRList[h + w - k];
        ans %= MOD;
        System.out.println(ans);
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}