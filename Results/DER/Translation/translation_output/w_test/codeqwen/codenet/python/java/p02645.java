Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, 3));
    }
}
```

This Java program reads a line of input from the user, and then prints the first three characters of that line. The `substring(0, 3)` method is used to extract the first three characters from the input string.
