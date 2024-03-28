Below is the Java equivalent of the provided Python code. I encapsulated the solution into a `main` method inside the `Solution` class.

```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        int mod = 998244353;

        int[] lis = new int[2 * N + 1];
        lis[0] = 1;
        int R = 0;
        int B = 0;

        int c = 0;
        for (char n : S.toCharArray()) {

            if (n == '0') {
                R += 2;
            } else if (n == '1') {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }

            int[] nlis = new int[2 * N + 1];

            for (int i = 0; i < 2 * N; i++) {

                if (i < R) {
                    nlis[i + 1] += lis[i];
                    nlis[i + 1] %= mod;
                }

                if (c - i < B) {
                    nlis[i] += lis[i];
                    nlis[i] %= mod;
                }
            }

            lis = nlis;
            c += 1;
        }

        for (int loop = 0; loop < N; loop++) {

            int[] nlis = new int[2 * N + 1];

            for (int i = 0; i < 2 * N; i++) {

                if (i < R) {
                    nlis[i + 1] += lis[i];
                    nlis[i + 1] %= mod;
                }

                if (c - i < B) {
                    nlis[i] += lis[i];
                    nlis[i] %= mod;
                }
            }

            lis = nlis;
            c += 1;
        }

        int sum = 0;
        for (int i : lis) {
            sum += i;
            sum %= mod;
        }
        System.out.println(sum);
        scanner.close();
    }
}
```

This Java code reads the input from the console, processes it similarly to the Python code, and outputs the result. Note that Java requires explicit array initialization, and it does not infer array sizes at runtime, hence why the size `2 * N + 1` is used to initialize the `lis` and `nlis` arrays.
