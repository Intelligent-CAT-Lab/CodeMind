Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input.substring(0, 3));
        scanner.close();
    }
}
```

This Java code snippet performs the same operation as the Python code; it reads a string input from the user and prints out the first three characters of the string.
