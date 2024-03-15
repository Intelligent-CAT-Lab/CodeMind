Below is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Assuming 'n' is supposed to represent an ASCII value of a character,
        // we can use 'char' in java. Otherwise, if 'n' is int, you can ignore 'char' casting.
        int n = scanner.nextInt();

        if (n >= 65 && n <= 90) {
            System.out.println("1");
        } else if (n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
```
Make sure when providing input, you're inputting the ASCII value of the character if that's what you intended to compare in the Python code. If 'n' should represent the actual character rather than its ASCII value, you'll need a slightly different implementation in Java, reading a character or string from the user and then possibly converting the first character to its ASCII value.
