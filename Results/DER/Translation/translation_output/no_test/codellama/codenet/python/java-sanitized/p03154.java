import java.util.Scanner;

public class p03154 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MOD = 1000000007;
        int listSize = 200000001;

        int[] fList = new int[listSize];
        int[] fRList = new int[listSize];

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

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = k * fList[h + w] * fRList[h + w - k];
        ans += (h + w) * k * (k + 1) * fList[h + w - 1] * fRList[2] * fRList[h + w - k];
        ans %= MOD;
        ans += h * w * fList[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * fRList[h + w - k];
        ans %= MOD;

        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int modulus) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulus;
        }
        return result;
    }
}