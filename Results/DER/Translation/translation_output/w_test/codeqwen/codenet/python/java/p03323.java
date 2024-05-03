Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if they are less than 9, and prints "Yay!" if they are, or ":(" if they are not. The `Scanner` class is used to read input from the user, and the `close()` method is called to close the scanner after it's no longer needed.
