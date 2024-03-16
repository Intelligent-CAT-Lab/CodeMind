Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class MultiplicationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java program mirrors the logic of the Python script: it reads an integer from the user, then iterates through the numbers 1 to 9 for both `i` and `j`, checking if their product equals `N`. If it finds such a pair, it prints "Yes" and terminates; otherwise, it finishes the loops and prints "No".
