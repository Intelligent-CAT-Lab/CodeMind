Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = (int) (1e9 + 7);
    static final int listSize = 20000001;

    static int[] fList = new int[listSize];
    static int[] fRList = new int[listSize];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        fList[0] = 1;
        for (int i = 1; i < listSize; i++) {
            fList[i] = (fList[i - 1] * (i + 1)) % MOD;
        }

        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2, MOD);
        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }

        int ans = k * fList[h + w] * fRList[h + w - k];
        ans += (h + w) * k * (k + 1) * fList[h + w - 1] * fRList[2] * fRList[h + w - k];
        ans %= MOD;
        ans += h * w * fList[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * fRList[h + w - k];
        ans %= MOD;
        System.out.println(ans);
    }

    static int pow(int base, int exp, int mod) {
        if (exp == 0) {
            return 1;
        }
        int halfExp = pow(base, exp / 2, mod);
        if (exp % 2 == 0
