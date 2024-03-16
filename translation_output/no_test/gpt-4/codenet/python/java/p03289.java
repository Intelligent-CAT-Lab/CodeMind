Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int flag = 0;
        if (S.charAt(0) != 'A') {
            flag = 1;
        }
        
        int count = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            flag = 1;
        }

        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                count2++;
            }
        }
        if (count2 != 2) {
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
        
        scanner.close();
    }
}
```

I have made the following changes in the process of translation:

1. Introduced `Scanner` to take the input from the user, similar to the Python `input()` function.
2. Used `charAt()` method to access the characters of the string by index.
3. Replaced Python list indexing with the appropriate Java methods such as `charAt()` and `length()`.
4. Used `Character.isUpperCase()` to check if a character is an uppercase letter.
5. Closed the `Scanner` at the end to avoid any potential resource leaks.
6. Wrapped the code into a `Main` class and the `main` method, which is necessary in Java for program execution.
