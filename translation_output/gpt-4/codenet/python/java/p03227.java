Here's the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() == 2) {
            System.out.println(input);
        } else {
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println(reversed);
        }
    }
}
```

This Java code takes a line of input from the user, checks if the length is exactly 2, and if so, it prints the input as it is. Otherwise, it reverses the string and then prints it.
