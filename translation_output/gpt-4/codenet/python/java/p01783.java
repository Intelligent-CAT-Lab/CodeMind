Here's your translated Java code:

```java
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.math.*;

public class Main {

    private static final int MOD = 1000000007;
    private static final double EPS = 1.0 / 10000000000000.0;
    private static final long INF = (long)1e20;
    private static final int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private static final int[][] ddn = {
        {-1, 0}, {-1, 1}, {0, 1}, {1, 1},
        {1, 0}, {1, -1}, {0, -1}, {-1, -1}
    };
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Map<String, Integer> fm = new HashMap<>();

    public static void main(String[] args) throws IOException {
        System.out.println(solve());
    }

    public static int[] LI() throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }

    public static int[] LI_() throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x) - 1).toArray();
    }

    public static double[] LF() throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
    }

    public static String[] LS() throws IOException {
        return reader.readLine().split(" ");
    }

    public static int I() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static double F() throws IOException {
        return Double.parseDouble(reader.readLine());
    }

    public static String S() throws IOException {
        return reader.readLine();
    }

    public static void pf(String s) {
        System.out.println(s);
        System.out.flush();
    }

    public static String solve() throws IOException {
        String s = S();
        int r = f(s);
        if (r < 0) {
            return "invalid";
        }

        return String.valueOf(r);
    }

    private static int f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }

        int l = s.length();
        int r = -1;
        if (l > 5 && (s.charAt(1) == '(' || s.charAt(1) == '?') && (s.charAt(l - 1) == ')' || s.charAt(l - 1) == '?')) {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i + 1, l - 1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i + 1, l - 1));
                    if (tl >= 0 && tr >= 0 && r < tl) {
                        r = tl;
                    }
                }
            }
        }
        boolean ff = true;
        if (s.charAt(0) == '0' && l > 1) {
            ff = false;
        }
        String toCheck = "RL,()";
        for (int i = 0; i < toCheck.length(); i++) {
            if (s.indexOf(toCheck.charAt(i)) != -1) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace('?', '9'));
        }
        fm.put(s, r);
        return r;
    }
}
```

Some key points to note during the translation:

- Java requires the explicit declaration of types for variables, method parameters, and return types.
- Static typing also means that all methods used must be explicitly defined or imported.
- Error handling in Java typically involves the use of try-catch blocks or specifying `throws Exception` on method signatures.
- In Python, reading from `sys.stdin` is used, while in Java, we use a `BufferedReader` for standard input.
- Java does not support global scope for variables as Python does, so we use static class members instead.
- Function definitions (`def`) turned into static methods with correctly typed parameters and return types.
- Python's 'print' function translates to `System.out.println` in Java.
- Python slicing was translated to the use of Java's `substring` method.
- I've set the recursion limit to be quite high by default as in the original code, but Java does not have a specific function like `sys.setrecursionlimit`; instead, you'd have to set the stack size using JVM settings (using the `-Xss` parameter) if necessary.

Remember to handle exceptions where necessary and to manage input/output streams according to the actual usage environment of the code. This code assumes standard input and output.
