Here is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next(); // if you want to ensure a single character is read, use `.next()`

        if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close(); // It is a good practice to close the scanner after usage
    }
}
```

Make sure to keep in mind that `Scanner.next()` will read the next complete token from the input, which could be more than just one character. If you want to ensure that you read exactly one character as in your Python example, you might want to use `Scanner.next().charAt(0)` to get the first character of the input and compare it with character values instead of strings in your conditionals.
