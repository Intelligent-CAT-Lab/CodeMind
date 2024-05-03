Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    static final int cut = 1000000007;
    static int nn, k;
    static int[][] abli;
    static int[] unused;
    static int[] unusedacum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nn = sc.nextInt();
        k = sc.nextInt();
        int n = 2 * nn;
        abli = new int[k][2];
        for (int i = 0; i < k; i++) {
            abli[i][0] = sc.nextInt();
            abli[i][1] = sc.nextInt();
            if (abli[i][0] > abli[i][1]) {
                int temp = abli[i][0];
                abli[i][0] = abli[i][1];
                abli[i][1] = temp;
            }
        }
        unused = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            unused[i] = 1;
        }
        for (int i = 0; i < k; i++) {
            unused[abli[i][0]] -= 1;
            unused[abli[i][1]] -= 1;
        }
        unusedacum = new int[n + 1];
        unusedacum[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            unusedacum[i] = (unusedacum[i - 1] + unused[i]) % cut;
        }
        System.out.println(g(1, n));
    }

    static int modInverse(int a, int b) {
        int r0 = a, r1 = b, s0 = 1, s1 = 0;
        while (r1 != 0) {
            int
