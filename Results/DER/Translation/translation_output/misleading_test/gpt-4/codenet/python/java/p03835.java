Here's the translated Java code that reproduces the functionality of the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int count = 0;

        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```
Here's an explanation of how the Python code translates to Java:

- The `Scanner` class is used for reading input from the user.
- The input values for `k` and `s` are read using `nextInt()`.
- In Java, we must declare and initialize a variable (`count`) to accumulate the total number of valid combinations.
- Two nested `for` loops iterate through all possible values of `y` and `z` in the specified range (`0` to `k`, inclusive).
- An `if` statement checks if `s - y - z` is within the range of `0` to `k`, inclusive.
- If the condition is true, the `count` is incremented.
- Finally, the `count` value, which represents the sum of valid combinations is printed.
