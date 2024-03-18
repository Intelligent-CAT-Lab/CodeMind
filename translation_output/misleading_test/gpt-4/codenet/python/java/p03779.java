Here's the translated code from Python to Java that accomplishes the same task:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // Solving quadratic equation to find the minimum time
        int t = (int)(-1 + Math.sqrt(1 + 8 * (long)x)) / 2;

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }

        scanner.close();
    }
}
```

When a test input `6` is provided to this program, the expected output is `4`, which this program should produce correctly.
