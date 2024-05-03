Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read an integer from the user. The `if` and `else` statements are used to check if the value of `X` is greater than or equal to 30, and print "Yes" or "No" accordingly. Finally, the `scanner.close()` method is used to close the scanner to release system resources.
