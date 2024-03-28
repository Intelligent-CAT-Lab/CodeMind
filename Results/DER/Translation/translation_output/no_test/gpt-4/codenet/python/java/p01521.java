Certainly! Below is the Java translation of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x' ? 'x' : 'o');
        scanner.close();
    }
}
```

This Java code includes importing the Scanner class for getting input from the user, just like `raw_input` does in Python. The conditional expression `(s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x')` checks the first and last character, similar to `s[0]=='x' and s[-1]=='x'`, and uses the ternary operator `?` which is equivalent to the inline `if` in Python, to print `'x'` or `'o'` based on the condition.
