```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int mod = 998244353;
        int[] factorials = new int[N + 11];
        factorials[0] = 1;
        for (int m = 1; m <= N + 10; m++) {
            factorials[m] = (factorials[m - 1] * m) % mod;
        }
        int[] invs = new int[N + 11];
        invs[N + 10] = pow(factorials[N + 10], mod - 2, mod);
        for (int m = N + 10; m >= 1; m--) {
            invs[m - 1] = (int) ((long) invs[m] * m % mod);
        }
        int ans = 0;
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) {
                    break;
                }
                int dist = one + two * 2;
                int zero = modnCr(N, one + two, mod, factorials, invs);
                int now = 0;
                if (dist < X) {
                    now = modnCr(one + two, one, mod, factorials, invs) * zero;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = modnCr(one + dtwo, one, mod, factorials, invs) * zero;
                    }
                
