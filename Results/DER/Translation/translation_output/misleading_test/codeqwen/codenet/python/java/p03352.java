Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 1; b <= x; b++) {
            for (int p = 2; p <= x; p++) {
                if (Math.pow(b, p) <= x) {
                    ans = Math.max(ans, (int) Math.pow(b, p));
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then it iterates over all numbers from 1 to the input number, and for each number, it iterates over all numbers from 2 to the input number. If the result of raising the current number to the power of the current power is less than or equal to the input number, it updates the answer to the maximum of the current answer and the result. If the result is greater than the input number, it breaks out of the inner loop. Finally, it prints the answer.
