Below is the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class ABCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stdin = scanner.nextLine();
        String s = stdin;
        String result = (s.contains("A") && s.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}
```

Here's an explanation of the key parts:

- We import `Scanner` to read from the standard input, similar to the `input()` function in Python.
- In the `main` method, we create a `Scanner` object to read a line from the standard input.
- We declare a `String` variable `stdin` to store the input string.
- We assign the input string to another `String` variable `s`.
- We use the ternary operator (`? :`) to check the presence of both "A" and "B" in the string `s`. It mimics the inline if-else (the ternary if `... if ... else ...` in Python).
- Finally, we print the result using `System.out.println`.
