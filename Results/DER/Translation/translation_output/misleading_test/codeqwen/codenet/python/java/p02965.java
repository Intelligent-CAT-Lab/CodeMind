Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] factorials = getFactorials(M * 3 / 2 + N, 1000000007);
        int[] finvs = modInv(M * 3 / 2 + N, 1000000007);

        int[] odds = new int[M % 2 + M];
        for (int i = M % 2; i <= M; i += 2) {
            odds[i] = i;
        }

        int halves = (M * 3 - odds[M]) / 2;

        int[] oc1 = ncr(N, odds, factorials, finvs);
        int[] oc2 = ncr(N - 1, odds, factorials, finvs);

        int c1 = 0;
        for (int i = 0; i < halves + N - 1; i++) {
            c1 = (c1 + (long) oc1[i] * finvs[i] % 1000000007 * finvs[halves + N - 1 - i] % 1000000007) % 1000000007;
        }

        int c2a = 0;
        for (int i = 0; i < halves + N - 1; i++) {
            c2a = (c2a + (long) oc1[i] * finvs[i] % 1000000007 * finvs[halves + N - 1 - i] % 1000000007) % 1000000007;
        }

        int c2b = 0;
        for (int i = 0; i < halves + N - 2; i++) {
            c2b = (c2b + (long) oc2[i] * finvs[i] % 1000000007 * finvs[hal
