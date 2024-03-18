Here's the translation of the provided Python code into Java:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        long X = Long.parseLong(input[1]);
        
        long[] l = new long[51];
        long[] p = new long[51];
        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i <= 50; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }
        
        long ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans += 1;
                break;
            }
            
            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X -= 1;
            } else if (X == l[i - 1] + 2) {
                ans += 1;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}
```

This code reads two integers from standard input, initializes and builds two arrays, `l` and `p`, calculates the answer based on the provided algorithm, and finally prints the answer to standard output. Note that you may need to package this code as per your project structure or execution environment. This example includes a simple `main` method which assumes the input will be available in the expected format.
