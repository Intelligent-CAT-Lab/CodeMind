import java.util.*;

public class p03154 {
    static final long MOD = 1000000007;
    static final int listSize = 20000001;
    static long[] fList = new long[listSize];
    static long[] fRList = new long[listSize];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listSize; i++) {
            fList[i] = (i == 0) ? 1 : (fList[i - 1] * i) % MOD;
        }
        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2, MOD);
        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }
        long h = scanner.nextLong();
        long w = scanner.nextLong();
        long k = scanner.nextLong();
        long ans = k * fList[(int)(h + w)] * fRList[(int)(h + w - k)] % MOD;
        ans += (h + w) * k * (k + 1) * fList[(int)(h + w - 1)] * fRList[2] * fRList[(int)(h + w - k)] % MOD;
        ans += h * w * fList[(int)(h + w - 2)] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * fRList[(int)(h + w - k)] % MOD;
        ans %= MOD;
        System.out.println(ans);
    }

    static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }
}