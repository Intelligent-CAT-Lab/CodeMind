```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[50001];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }

        int[] r = new int[2 * t];
        Arrays.fill(r, 0, t, 1);

        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;

            if (n < ai) {
                int ts = Math.min(t, ai - n);
                int temp = r[ti - ts];
                r[ti - ts] = r[ti];
                r[ti] = temp;
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int bit : r) {
            result.append(bit == 1 ? '(' : ')');
        }

        System.out.println(result.toString());
    }
}
```
```
