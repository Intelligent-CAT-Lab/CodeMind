Here is the Java equivalent of the given Python code. This Java code will read a number from standard input, similar to how the Python code does, and produce the expected output based on the input.

```java
import java.util.Scanner;

public class AlphabetEncoding {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            number--; // As Java's indexing is 0-based, we decrement first
            result.append((char) ('a' + number % 26));
            number /= 26;
        }
        System.out.println(result.reverse().toString());
    }
}
```

This Java program will produce the same output as the given Python code for an equivalent input. It uses a `Scanner` to read the integer input, then constructs the output in a `StringBuilder` by repeatedly taking the modulo 26 of the input number to get a character, appending it to the result, and then doing integer division by 26. Finally, it reverses the `StringBuilder` contents to match the Python code's `[::-1]` slice operation, which reverses the string. The `System.out.println` method is used to print the result.
