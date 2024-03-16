Here's the Python code translated into Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static long k;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        long l = 0;
        long r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) >> 1;
            if (isOk(m)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }
    
    private static boolean isOk(long m) {
        long s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) return false;
            if (cnt == n) break;
            m >>= 1;
        }
        return true;
    }
}
```

Please note that Java handles input and output differently from Python. In the above Java program, I've replaced the Python input methods with a `BufferedReader` and a `StringTokenizer` to read the input. Also, as Java is statically typed, types are explicitly declared. I used the equivalent Java long type since `k` might exceed the range of int.

For the test input "1 1" to work correctly with this Java program, you will need to provide the input in this way:

```
1 1
```

And the expected output would be:

```
1
```

Don't forget to run this Java program within an environment that provides standard input and output handling.
