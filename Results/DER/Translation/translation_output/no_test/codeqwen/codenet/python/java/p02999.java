Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int result = (a < b) ? 0 : 10;
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, compares them, and prints 0 if the first integer is less than the second, or 10 otherwise.
