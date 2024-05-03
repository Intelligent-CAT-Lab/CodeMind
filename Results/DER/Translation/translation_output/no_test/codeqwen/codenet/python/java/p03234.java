Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    static final int cut = 1000000007;
    static int nn, k;
    static int[][] abli;
    static int[] unused;
    static int[] unusedacum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nn = scanner.nextInt();
        k = scanner.nextInt();
        int n = 2 * nn;
        abli = new int[k][2];
        for (int i = 0; i < k; i++) {
            abli[i][0] = scanner.nextInt();
            abli[i][1] = scanner.nextInt();
            if (abli[i][0] > abli[i][1]) {
                int temp = abli[i][0];
                abli[i][0] = abli[i][1];
                abli[i][1] = temp;
            }
        }
        unused = new int[n + 1];
        Arrays.fill(unused, 1);
        for (int[] a : abli) {
            unused[a[0]]--;
            unused[a[1]]--;
        }
        unusedacum = IntStream.range(0, n + 1).map(i -> Arrays.stream(unused, 0, i + 1).sum()).toArray();

        System.out.println(g(1, n));
    }

    static int modInverse(int a, int b) {
        int r0 = a, r1 = b, s0 = 1, s1 = 0;
        while (r1 != 0) {
            int q = r0 / r1;
            int rtmp = r0 - q * r1;
            int stmp = s0 - q * s1;
            r0 = r1;
            s0 = s1;
            r1 = rtmp;
            s1
