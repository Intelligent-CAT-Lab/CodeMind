Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, input.length() - 8));
    }
}
```

This Java program reads a string from the user, then uses the `substring` method to get the substring from the start of the string up to the 8th last character. The result is then printed to the console.
