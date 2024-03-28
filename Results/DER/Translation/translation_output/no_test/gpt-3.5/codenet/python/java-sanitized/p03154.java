public class p03154 {
    public static void main(String[] args) {
        int MOD = (int) (Math.pow(10, 9) + 7);
        int listSize = 20000001;

        long[] fList = new long[listSize];
        long[] fRList = new long[listSize];

        for (int i = 0; i < listSize; i++) {
            fList[i] = 1;
            fRList[i] = 1;
        }

        for (int i = 0; i < listSize - 1; i++) {
            fList[i + 1] = (fList[i] * (i + 1)) % MOD;
        }

        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2, MOD);

        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }

        int h = 3; // example value, replace with real input
        int w = 4; // example value, replace with real input
        int k = 2; // example value, replace with real input

        long ans = k * fList[h + w] * fRList[h + w - k];
        ans += (h + w) * k * (k + 1) * fList[h + w - 1] * fRList[2] * fRList[h + w - k];
        ans %= MOD;
        ans += h * w * fList[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * fRList[h + w - k];
        ans %= MOD;
        System.out.println(ans);
    }

    public static long pow(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}