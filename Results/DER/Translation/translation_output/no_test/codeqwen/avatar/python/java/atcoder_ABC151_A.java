Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((char) (scanner.next().charAt(0) + 1));
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, gets the first character of the string, converts it to its ASCII value, increments it by 1, and then converts it back to a character. The result is then printed to the console.
