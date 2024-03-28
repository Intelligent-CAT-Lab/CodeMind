Here's the translated Java code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader input = new FastReader();
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if ((long) A * B % 2 == 0 && (long) B * C % 2 == 0 && (long) C * A % 2 == 0) {
            System.out.println("Tem");
        } else {
            System.out.println("Hom");
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

Note that Java is a statically-typed language unlike Python, and thus requires explicit type declarations for variables. The `BufferedReader` and `StringTokenizer` classes are being used for efficient input reading, similarly to how Python reads input with `sys.stdin.readline`. The `BigInteger` import is not needed as we are using primitive data types, and exception handling is required when dealing with input/output in Java. The logic within the `main` method is the same, checking if the product of any two numbers is even, and printing the corresponding output.
