Here's the Python code translated into Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Map<String, Integer> memoizationMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String s = reader.readLine().trim();
        int result = calculate(s);
        System.out.println(result < 0 ? "invalid" : result);
    }

    private static int calculate(String s) {
        if (memoizationMap.containsKey(s)) {
            return memoizationMap.get(s);
        }

        int length = s.length(), result = -1;
        if (length > 5 && (s.charAt(1) == '(' || s.charAt(1) == '?') && (s.charAt(length - 1) == ')' || s.charAt(length - 1) == '?')) {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < length - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int leftResult = calculate(s.substring(2, i));
                    int rightResult = calculate(s.substring(i + 1, length - 1));
                    if (leftResult >= 0 && rightResult >= 0) {
                        result = Math.max(result, rightResult);
                    }
                }
            }

            if (s.charAt(0) == 'L' || s.charAt(0) == '?') {
                for (int i = 3; i < length - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int leftResult = calculate(s.substring(2, i));
                    int rightResult = calculate(s.substring(i + 1, length - 1));
                    if (leftResult >= 0 && rightResult >= 0) {
                        result = Math.max(result, leftResult);
                    }
                }
            }
        }

        boolean valid = s.charAt(0) != '0' || length == 1;
        for (char tc : new char[]{'R', 'L', ',', '(', ')'}) {
            if (s.indexOf(tc) != -1) {
                valid = false;
                break;
            }
        }
        if (valid) {
            result = Integer.parseInt(s.replace('?', '9'));
        }

        memoizationMap.put(s, result);
        return result;
    }
}

```

This Java program converts the Python code to a recursive method `calculate` that caches its results in a `HashMap` named `memoizationMap`. The code uses a `BufferedReader` to read the input string from the standard input (stdin). Note that this Java translation omits some functions and imports that were included in the original Python script but are not used, thus ensuring the code remains relevant and concise for the task at hand.

Make sure to run your tests with an appropriate setup to pass the input to the `Main` class's `main` method since the `BufferedReader` expects input from the standard input stream.
