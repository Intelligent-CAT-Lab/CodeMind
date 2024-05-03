Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int p = Integer.parseInt(parts[1]);
        System.out.println((3*a+p)/2);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the result of the expression `(3*a+p)//2`, and prints the result. The `Scanner` class is used to read the input from the user, and the `split` method is used to split the input string into an array of strings, which are then converted to integers using the `Integer.parseInt` method. The `System.out.println` method is used to print the result of the expression.
