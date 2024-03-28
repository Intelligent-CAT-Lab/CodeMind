import java.util.Scanner;

public class p03154 {
    static final long MOD = (long)Math.pow(10, 9) + 7;
    static final int listSize = 20000001;

    static long[] fList = new long[listSize];
    static long[] fRList = new long[listSize];

    public static void main(String[] args) {
        for (int i = 0; i < listSize; i++) {
            fList[i] = 1;
            fRList[i] = 1;
        }

        for (int i = 1; i < listSize; i++) {
            fList[i] = (fList[i-1] * i) % MOD;
        }

        fRList[listSize-1] = pow(fList[listSize-1], MOD - 2);

        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i+1] * (i+1)) % MOD;
        }

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        long ans = k * fList[h+w] % MOD * fRList[h+w-k] % MOD;
        ans += (h+w) * k * (k+1) % MOD * fList[h+w-1] % MOD * fRList[2] % MOD * fRList[h+w-k] % MOD;
        ans %= MOD;
        ans += h * w % MOD * fList[h+w-2] % MOD * (k-1) * k * (k+1) % MOD * pow(3, MOD-2) % MOD * fRList[h+w-k] % MOD;
        ans %= MOD;

        System.out.println(ans);
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}