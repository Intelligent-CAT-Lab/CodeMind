Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then it iterates over all possible combinations of `i` and `j` such that `i + j + (n - i - j) = n`. If it finds a combination where `(y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)`, it prints the combination and exits the program. If no such combination is found, it prints `-1 -1 -1`.
