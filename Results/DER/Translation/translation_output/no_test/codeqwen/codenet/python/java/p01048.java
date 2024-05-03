Here is the Java version of your Python code:

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
                    count += 1;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target += 1;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it finds the smallest integer greater than or equal to 1 that has exactly N divisors. It prints this integer and stops.
