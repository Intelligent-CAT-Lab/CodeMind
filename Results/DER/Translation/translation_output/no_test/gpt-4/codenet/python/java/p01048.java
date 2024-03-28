Below is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1;

        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count++;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target++;
        }

        scanner.close();
    }
}
```

This Java code reads an integer from standard input, then finds the first number with exactly `N` factors using a similar logic as the provided Python code. Please note that in the Java code, we are using a `Scanner` to read input from the user, and we are closing the `Scanner` at the end with `scanner.close()`.
