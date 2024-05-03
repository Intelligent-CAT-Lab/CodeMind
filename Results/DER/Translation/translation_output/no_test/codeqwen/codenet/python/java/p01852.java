Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n > 0 ? Integer.toBinaryString(n).length() - 1 : 0);
    }
}
```

In this Java code, we use `Scanner` to get the input from the user. The `Integer.toBinaryString(n).length()` method is used to convert the integer to binary and get its length. We subtract 1 because the binary representation of a number includes the '0b' prefix. If the number is 0, we print 0.
