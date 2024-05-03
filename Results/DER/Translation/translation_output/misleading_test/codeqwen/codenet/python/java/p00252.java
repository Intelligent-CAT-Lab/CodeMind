Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();

        String[] O = {"1 1 0", "0 0 1"};

        boolean found = false;
        for (String s : O) {
            if (s.equals(B)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string input from the user, checks if it matches any of the strings in the array O, and prints "Open" if it does, or "Close" if it doesn't.
