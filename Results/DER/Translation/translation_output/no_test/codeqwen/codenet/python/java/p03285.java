Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it loops through all possible combinations of `i` and `j` that satisfy the equation `4*i + 7*j = N`. If it finds such a pair, it prints "Yes" and exits the program. If it doesn't find any such pair, it prints "No".
