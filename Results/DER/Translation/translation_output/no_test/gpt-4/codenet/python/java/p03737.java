Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class AcronymGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().toUpperCase().split(" ");
        System.out.println(parts[0].charAt(0) + "" + parts[1].charAt(0) + "" + parts[2].charAt(0));
        scanner.close();
    }
}
```
This Java program does the same as the Python script; it reads a line from the standard input, converts it to uppercase, splits it into parts, and then extracts and prints the first character of the first three parts as a concatenated string. Note that the `""` is used to ensure that the characters are concatenated as strings, not added as integers.
