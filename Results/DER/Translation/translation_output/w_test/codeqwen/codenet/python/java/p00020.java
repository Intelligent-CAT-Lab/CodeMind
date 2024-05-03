Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.toUpperCase();
        System.out.println(output);
    }
}
```

This Java program reads a line of text from the user, converts it to uppercase using the `toUpperCase()` method, and then prints the result.
