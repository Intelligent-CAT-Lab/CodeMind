Here's the equivalent Java code for the provided Python code. The implementation reads input from the console, checks the first and last characters of the input string, and prints 'x' if both are 'x', otherwise it prints 'o'.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        System.out.println((firstChar == 'x' && lastChar == 'x') ? 'x' : 'o');

        scanner.close();
    }
}
```

You can use this code in a Java environment to test for any input. For your provided test input ('oxxoxoo'), the expected output would be 'o'.
