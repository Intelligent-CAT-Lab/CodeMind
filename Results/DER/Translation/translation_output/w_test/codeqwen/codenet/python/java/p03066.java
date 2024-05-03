Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int mod = 998244353;
        int[] fac = new int[N + 10];
        int[] inv = new int[N + 10];
        fac[0] = 1;
        for (int m = 1; m <= N; m++) {
            fac[m] = (int) ((long) fac[m - 1] * m % mod);
            inv[m] = pow(fac[m], mod - 2, mod);
        }
        int ans = 0;
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) {
                    break;
                }
                int dist = one + two * 2;
                int zero = modnCr(one + two, one, mod, fac, inv);
                int now = 0;
                if (dist < X) {
                    now = modnCr(one + two, one, mod, fac, inv) * zero;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = modnCr(one + dtwo, one, mod, fac, inv) * zero;
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }
                ans += now;
                ans %= mod;
            }
        }
        System.out.println(ans);
    
