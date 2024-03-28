Here is the equivalent Java code that performs the same task as the given Python code:

```java
import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char nextChar = (char) (c + 1);
        System.out.println(nextChar);
        scanner.close();
    }
}
```

This Java code reads a character from the user input, increments its ASCII value by one to get the next character, and then prints out this next character. It's important to close the `Scanner` after we're done to free the resource.
