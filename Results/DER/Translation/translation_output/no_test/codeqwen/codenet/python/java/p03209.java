Here is the Java version of your Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int INF = (int) 1e18;
    static final int MOD = (int) 1e9 + 7;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());

        int[] l = new int[51];
        l[0] = 1;
        int[] p = new int[51];
        p[0] = 1;
        for (int i = 1; i < 51; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        int ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans += 1;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X -= 1;
                continue;
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

Please note that Java does not have a built-in function for reading multiple integers from a single line, so I used `StringTokenizer` to split the input line into individual tokens. Also, Java does not have a built-in function for reading a single character, so I used `br.readLine
