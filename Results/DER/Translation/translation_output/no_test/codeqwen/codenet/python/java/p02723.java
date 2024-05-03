Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `charAt()` method is used to get the character at a specific index in the string. The `System.out.println()` method is used to print the output to the console. The `close()` method is used to close the scanner to release system resources.
