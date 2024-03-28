Here is the Python code you provided translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        r = r % 6;
        ans += q;
        if (r > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java program incorporates the use of `Scanner` to read the input from the user (assuming it's run in an environment where standard input is available), does the "divide and find remainder" operation using `/` and `%` (as Java lacks a built-in divmod function), and uses standard integer arithmetic for the calculations just like the Python code.

To use this code snippet, you can compile and run the `Main` class, and when prompted, provide an integer input to get the expected output.
