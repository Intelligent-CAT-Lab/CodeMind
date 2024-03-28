Here is the equivalent Java code for the Python program you provided:

```java
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    static final long INF = (long) 1e20;
    static final double EPS = 1.0 / 1e10;
    static final long MOD = (long) 1e9 + 7;
    static final int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static final int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    
    public static void setRecursionLimit(int limit) {
        Thread.currentThread().setStackSize(limit);
    }

    public static int[] LI() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] res = new int[st.countTokens()];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(st.nextToken());
        }
        return res;
    }

    public static int[] LI_() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] res = new int[st.countTokens()];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        return res;
    }

    public static double[] LF() throws IOException {
        st = new StringTokenizer(br.readLine());
        double[] res = new double[st.countTokens()];
        for (int i = 0; i < res.length; i++) {
            res[i] = Double.parseDouble(st.nextToken());
        }
        return res;
    }

    public static String[] LS() throws IOException {
        return br.readLine().split(" ");
    }

    public static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static double F() throws IOException {
        return Double.parseDouble(br.readLine());
    }

    public static String S() throws IOException {
        return br.readLine();
    }

    public static void pf(String s) {
        System.out.flush();
        System.out.println(s);
    }

    public static String main() throws IOException {
        setRecursionLimit(10000000);
        ArrayList<Integer> rr = new ArrayList<>();

        while (true) {
            String n = S();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
            break;
        }

        return String.join("\n", rr.stream().map(Object::toString).collect(Collectors.toList()));
    }

    public static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t += 1;
                if (t == 4) {
                    r += 1;
                    t = 0;
                }
            } else {
                t -= 1;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}
```

This Java code provides a similar structure to the provided Python program, considering the idiomatic differences between the two languages. Be aware that the `main()` method and IO operations have been adapted to match Java's standard practices. Additionally, Java does not have a direct equivalent for Python's `print(..., flush=True)`, but we can simulate a similar effect using `System.out.flush()` followed by `System.out.println()`.

Please note that this code assumes that it should be reading and writing from/to the standard input/output streams, similarly to the Python code. To run this Java code, save it to a file named `Main.java`, compile it using `javac Main.java`, and then execute it with `java Main`. Make sure the input is provided according to the code's expectations, either interactively or through input redirection.
