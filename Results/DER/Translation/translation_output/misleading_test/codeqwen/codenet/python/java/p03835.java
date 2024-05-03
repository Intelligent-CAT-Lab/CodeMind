Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(sum(k, s));
    }

    public static int sum(int k, int s) {
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    count++;
                }
            }
        }
        return count;
    }
}
```

This Java program does the same thing as your Python code. It reads two integers from the user, calculates the sum of all possible pairs of integers (y, z) such that 0 <= s - y - z <= k, and prints the result.
