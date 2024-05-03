Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
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

This Java code does the same thing as your Python code. It reads an integer from the user, then it checks if there is a pair of integers (i, j) such that i * j equals the input number. If such a pair exists, it prints "Yes" and exits the program. If no such pair exists, it prints "No".
