Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.length() / 2 - s.length() + s.replace("p", "").length());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, calculates the length of the string, and then subtracts the number of 'p' characters from the length of the string. The `replace` method is used to remove all 'p' characters from the string, and the length of the resulting string is then calculated. The result is printed to the console.
