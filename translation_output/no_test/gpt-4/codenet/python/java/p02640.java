Here's the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();

        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if ((2 * a + 4 * b) == y) {
                count = 1;
                break;
            }
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}
```

This Java program does the same as the Python code you provided: it takes two integer inputs, checks a condition in a loop, and prints "Yes" or "No" depending on whether the condition was satisfied at least once. Note that in Java, you need to explicitly import the `Scanner` class for it to work and declare the class and the `main` method.
