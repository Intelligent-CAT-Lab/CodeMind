Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int L = Integer.parseInt(parts[0]);
        int R = Integer.parseInt(parts[1]);
        System.out.println(L * R);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, multiplies them, and prints the result. The `Scanner` class is used to read the input from the user, and the `split` method is used to split the input string into an array of strings, which are then converted to integers using the `Integer.parseInt` method.
