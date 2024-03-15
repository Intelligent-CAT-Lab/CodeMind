Here's the equivalent code in Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final int INF = Integer.MAX_VALUE;
    private static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String S = reader.readLine().trim();

        int N = S.length();

        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < N; i++) {
            if (zeroStart != Character.getNumericValue(S.charAt(i))) {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }

        int oneStartCounter = N - zeroStartCounter;

        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }

    // Utility methods could be added here to match the original python functions, if needed.
}
```

Note that in Java, we have to manage the input-output more explicitly using a `BufferedReader` and its `readLine` method to receive the input from stdin. Additionally, methods like `LI`, `II`, `LS`, `LI_`, `LF`, and `SI` would need to be implemented if you require them for further input parsing. Since the provided Python script only uses `SI()`, I've shown a line (`String S = reader.readLine().trim();`) that serves a similar purpose, and this snippet covers the functionality needed for the given task.

Also, the `INF` value is set to `Integer.MAX_VALUE` because it seems to be used as an unreachable value, but it has been set to a long literal of `1e18` in the Python version. If integers of that magnitude are required in the Java program, `INF` should be declared as `long INF = Long.MAX_VALUE;` or `long INF = 1000000000000000000L;`. For the sake of this example, since `INF` is not used directly in the given code, I have left it as `Integer.MAX_VALUE`. 

Additionally, I changed the `Math.pow` in `MOD` from `10 ** 9 + 7` to its equivalent long literal `(long)1e9 + 7` for efficiency and readability.
