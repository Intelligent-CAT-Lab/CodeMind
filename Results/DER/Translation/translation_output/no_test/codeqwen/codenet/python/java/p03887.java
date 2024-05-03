Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static int[] FACT = new int[100001];
    static int[] INVERSE_FACT = new int[100001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        FACT[0] = 1;
        INVERSE_FACT[0] = 1;
        for (int i = 1; i <= n; i++) {
            FACT[i] = (int) ((long) FACT[i - 1] * i % MOD);
            INVERSE_FACT[i] = inverse(FACT[i]);
        }

        int ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            return;
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= (c - y) / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0) {
                    continue;
                }

                int cur_ans = (int) ((long) FACT[x + y + z] * INVERSE_FACT[x] % MOD);
                cur_ans = (int) ((long) cur_ans * INVERSE_FACT[y] % MOD);
                cur_ans = (int) ((long) cur_ans * INVERSE_FACT[z] % MOD);
                cur_ans = (int) ((long) cur_ans * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD);

