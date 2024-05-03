Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, compares them, and prints the smaller one. The `Scanner` class is used to read the input from the user, and the `split` method is used to split the input string into an array of strings, which are then converted to integers using the `Integer.parseInt` method. The `if` statement is used to compare the two integers, and the `System.out.println` method is used to print the result.
