Here is the translated Java code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        if ((A * B) % 2 == 0 && (B * C) % 2 == 0 && (C * A) % 2 == 0) {
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
    }
}
```

This code sets up a `Main` class with a `main` method that reads three integers using a `FastReader` class, which is designed for fast input reading. The logic of determining whether to print "Tem" or "Hom" remains the same: it checks if the product of each of the three pairs is even. The `FastReader` class provides a helper method `nextInt()` to read integers and `next()` for tokens, wrapping a `BufferedReader` and using a `StringTokenizer` for efficient reading.
