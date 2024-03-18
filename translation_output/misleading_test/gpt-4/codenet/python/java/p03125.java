Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}
```

Here's how you would run a test with "4 12" as input:

```java
public class Main {
    public static void main(String[] args) {
        // Replace the following lines with your actual implementation of reading input.
        int x = 4;
        int y = 12;
        
        if (y % x == 0) {
            System.out.println(x + y);  // This should output 16.
        } else {
            System.out.println(y - x);  // For cases when y is not divisible by x.
        }
    }
}
```

However, to see the output of `-51` as mentioned in "Expected output", the test input provided "4 12" does not match because `4 + 12` equals `16`. If you intended to see `-51` as the output, the input should be such that `y - x` results in `-51`. 

If `x` is `4`, then `y` must be `-47` to get `-51` as output, which would mean the program behaves differently from the Python code, or there is a mistake in the provided expected output.
