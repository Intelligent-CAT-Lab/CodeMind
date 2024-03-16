Here's the equivalent Java code to accept two strings from user input, and then concatenate them in reversed order (T + S), similar to what the provided Python code does:

```java
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        String T = scanner.next();
        
        System.out.println(T + S);
        
        scanner.close();
    }
}
```

This Java code snippet imports the `Scanner` class for input, prompts the user for two strings which are stored in `S` and `T`, and finally prints out the concatenated result of `T` and `S`. The `scanner.close();` call closes the scanner to prevent a resource leak.
