Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);

        boolean condition = Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d);
        System.out.println(condition ? "Yes" : "No");
    }
}
```

Explanation:
- In the original Python code, the `input().split()` function reads a line from standard input, splits it by spaces, and `map(int, input().split())` turns each split string into an integer.
- The Java version uses a `Scanner` to read a line and `split(" ")` to split the string by spaces. Then `Integer.parseInt()` converts each split string into an integer.
- Python's shorthand for `if-else` is accomplished using the ternary operator `?:` in Java.
- Since Java doesn't have the slicing shorthand used by Python to reverse the string "YesNo", we directly use the condition to print "Yes" or "No".
- The `import java.util.Scanner;` statement is required to use the `Scanner` class.
- The code is wrapped in a class definition `Main` with a `main` method—this is the entry point for Java applications.
