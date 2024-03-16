Here is the translated Java code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        long s = 0;
        for (int b = K + 1; b <= N; b++) {
            long an = 0;
            long j = N / b;
            an = j * (b - K);
            
            if (N % b > 0) {
                long x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                long x2 = Math.min(N, (j + 1) * b - 1);
                
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}
```

Notes:

1. I've changed the function-based code to a static main method, which is idiomatic for Java programs.
2. I've used `BufferedReader` and `InputStreamReader` for reading from standard input as it's the standard way to handle input in Java.
3. Arrays and Lists are not used here as the problem doesn't require us to store multiple values at once, we just need to read N and K and then work with them.
4. Since the number of loops could be very large, and thus the sum `s` could be very large, I'm using a `long` for `s` and other variables involved in performant calculation to avoid integer overflow.
5. The variables `an`, `j`, `x1`, and `x2` are also declared as `long` because they may handle large computations.
6. Java doesn't have a built-in `min` function for `long` types, so I've used `Math.min` method (which does the same job).
7. `System.out.println` is used for printing the output to the console.
8. Exception handling is necessary because of the use of buffered reader's `readLine()`.

Remember to match the class name with your filename when you run this program.
