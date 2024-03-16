Below is the equivalent Java code for the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int n_k = n / k;
        int n_mod_k = n % k;

        long ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (-i + k) % k;
            int c_mod = (-i + k) % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k(a_mod, n_k, n_mod_k, k)
                     * mod_k(b_mod, n_k, n_mod_k, k)
                     * mod_k(c_mod, n_k, n_mod_k, k);
            }
        }

        System.out.println(ans);
    }

    private static int mod_k(int x, int n_k, int n_mod_k, int k) {
        int res = n_k;
        if (x != 0 && x <= n_mod_k) {
            res += 1;
        } else if (x == 0 && n_mod_k == k) {
            res += 1;
        }
        return res;
    }
}
```
Please note that there is a main class `Main` which is common in Java for an entry point. The `BufferedReader` and `StringTokenizer` are used for reading input as they are a common and efficient way of reading input in Java. The `mod_k` function has been slightly modified to accept the pre-calculated values of `n_k` and `n_mod_k` as well as `k` as arguments, in order to avoid global or class-level variables (since nested functions are not supported in Java like in Python).

Also, since Java is statically typed, variable types are explicitly declared. Furthermore, in the Python code, `ans` may need to be of type `long` if "n choose k" could exceed `Integer.MAX_VALUE`, so I've used `long` type for `ans` in Java to accommodate large values.

Please replace the `Main` class name if you have a different public class name for your file according to your specific requirements or coding standards.
