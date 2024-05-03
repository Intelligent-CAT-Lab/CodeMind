Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it loops through all pairs of integers from 1 to n-1, multiplies them, and increments a counter if the product is less than n. Finally, it prints the counter.
