Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (cntDivisor(j) == 8) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }

    public static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, counts the number of divisors for each odd number up to that integer, and then counts how many of those odd numbers have 8 divisors. It then prints out the count.
