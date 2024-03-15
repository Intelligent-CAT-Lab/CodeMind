Here's how you might translate the Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        String output = "ai1333" + "3".repeat(inputNumber / 100);
        System.out.println(output);

        scanner.close();
    }
}
```

Please note that in Java:
- We need to import `java.util.Scanner` to read input from the user.
- We declare a class and a main method as the entry point of the application.
- Instead of using `input()` like in Python, we use `Scanner.nextInt()` to read an integer.
- Instead of concatenating a string using multiplication as in Python (`"3" * int(...)`), we use the `String.repeat(int)` method to repeat the sequence of characters.
- We must explicitly close the `Scanner` object to avoid a resource leak.
