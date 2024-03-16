Here is the Python code translated into Java. Please note that I've made an assumption that the input will be provided via the standard input (using `Scanner`), similar to how you'd receive input using `input()` in Python.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = new StringBuilder(scanner.nextLine()).reverse().toString();
        final int mod = 1000000007; // 10**9 + 7
        int[] pows = new int[100005]; // 10**5 + 10
        pows[0] = 1;
        for (int i = 1; i < pows.length; i++) {
            pows[i] = (int)(((long)pows[i - 1] * 3) % mod);
        }
        long dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (dp * 2 + pows[i]) % mod;
            }
        }
        System.out.println(dp);
        scanner.close();
    }
}
```

Please take note of the following:

- Java arrays are initialized differently, and we need to specify the size in advance.
- Java does not have a direct equivalent of Python's list slicing, so I used `StringBuilder` to reverse the string.
- Java does not have a native `append` method on arrays, so we need to manually handle the array index.
- I used `long` for `dp` to prevent integer overflow when doubling `dp` in the loop.
- The `% mod` operation is used after each arithmetic operation to ensure the result stays within the bounds of the modulo as in the Python example.
- The `Scanner` class is used for input, which is the common method in Java for reading from `System.in`. Remember to close the `Scanner` afterwards.
- Array indexing and string charAt indexing start from 0 in Java, so there is no need to modify the loop range compared to the Python code.

