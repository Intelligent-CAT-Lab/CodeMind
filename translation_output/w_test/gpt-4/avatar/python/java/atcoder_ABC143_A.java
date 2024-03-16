Here's the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```

To run this Java code, you must ensure that the input is provided in a similar format as the test input specified. In the case of the Java language, a Scanner object is used to capture user input from the standard input stream.
