Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    static int nn, k;
    static int n;
    static List<int[]> abli = new ArrayList<>();
    static int[] unused;
    static int[] unusedacum;
    static int cut = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nn = sc.nextInt();
        k = sc.nextInt();
        n = 2 * nn;
        unused = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            unused[i] = 1;
        }
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        List<Integer> flattenabli = new ArrayList<>();
        for (int[] a : abli) {
            flattenabli.add(a[0]);
            flattenabli.add(a[1]);
        }
        Collections.sort(flattenabli);
        for (int i = 0; i < n + 1; i++) {
            unused[i] -= Collections.binarySearch(flattenabli, i);
        }
        unusedacum = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            unusedacum[i] = unusedacum[i - 1] + unused[i];
        }
        System.out.println(g(1, n));
    }

    static int modInverse(int a, int b) {
        int r0 = a, r1 = b, s0 = 1, s1 = 0;
        while (r
