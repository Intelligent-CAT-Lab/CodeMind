Here is the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean found = false;
        int answer = 0;
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                found = true;
                answer = i;
                break;
            }
        }
        System.out.println(found ? answer : -1);
        scanner.close();
    }
}
```

This Java code should be compiled and executed to get the expected output. Note that Java uses the `Scanner` class for getting input from the user, and it requires explicit type declaration for variables. Furthermore, Java does not use indentation to define blocks of code but uses braces `{}`. Also, remember to close the `Scanner` after its use to prevent any resource leaks.
