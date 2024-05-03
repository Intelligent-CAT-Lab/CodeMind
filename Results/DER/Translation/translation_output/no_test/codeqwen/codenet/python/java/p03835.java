Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then it iterates over all possible pairs of integers (y, z) where 0 <= y, z <= k. If the sum of y, z and s is within the range [0, k], it increments the count. Finally, it prints the count.
