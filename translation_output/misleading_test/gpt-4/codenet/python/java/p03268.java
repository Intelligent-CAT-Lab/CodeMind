Here's the translated code from Python to Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Buffered reader for fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the first line and split it into tokens
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int n_k = n / k;
        int n_mod_k = n % k;

        // Function to calculate mod_k
        int mod_k(int x) {
            int res = n_k;
            if (x != 0 && x <= n_mod_k) {
                res += 1;
            } else if (x == 0 && n_mod_k == k) {
                res += 1;
            }
            return res;
        }

        // Calculate the answer
        long ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (k - i) % k;
            int c_mod = (k - i) % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += (long) mod_k(a_mod) * mod_k(b_mod) * mod_k(c_mod);
            }
        }

        // Print the answer
        System.out.println(ans);
    }
}
```

Please note:

1. Java uses BufferedReader and StringTokenizer for fast input.
2. You need to implement `mod_k` method inside the main class or make it static if you want to call it from the `main` method.
3. Type casting to long in the answer calculation is needed, as the result can potentially overflow the `int` type limit when dealing with large numbers.
