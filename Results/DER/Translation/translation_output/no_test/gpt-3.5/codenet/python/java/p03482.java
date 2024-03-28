```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int mod = (int)1e9 + 7;
    static long INF = (long)1e18;
    static double eps = 1e-7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine().trim();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}
```
