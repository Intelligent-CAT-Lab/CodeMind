Below is the translated Java code that mimics the functionality of the provided Python code.

```java
import java.util.*;
import java.io.*;

public class Main {
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("\\s");
        int N = Integer.parseInt(inputs[0]);
        long X = Long.parseLong(inputs[1]);
        long D = Long.parseLong(inputs[2]);

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Long, List<long[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            long l = k * X + (k - 1) * ((long) k) / 2 * D;
            long r = k * X + (N - k + N - 1) * ((long) k) / 2 * D;
            memo.computeIfAbsent(l % D, v -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> LR : memo.values()) {
            LR.sort(Comparator.comparingLong(a -> a[0]));

            long cur = -INF;
            for (long[] lr : LR) {
                long l = lr[0];
                long r = lr[1];
                if (cur < l) {
                    ans += (r - l) / D + 1;
                    cur = r;
                }
                if (cur < r) {
                    ans += (r - cur) / D;
                    cur = r;
                }
            }
        }

        System.out.println(ans);
    }
}
```

Please note that this translation assumes that the input is given in the same format as specified in the test case, via standard input (`System.in`). Also, I've made use of `BufferedReader` and `InputStreamReader` for reading console input.

Strings are split using a space ("\\s") as the delimiter. I've also used a `HashMap` to mimic Python's defaultdict behavior, and a `Comparator` lambda function within the `sort()` method to sort the ranges by their left value, which is the first element of the long array.

The rest of the code follows a very similar logic to the provided Python code, taking into account the differences between Python and Java such as 0-indexing and type declarations.
