Below is the equivalent Java code for the provided Python script.

```java
import java.util.Scanner;

public class ClosestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        
        int score = Math.abs(a - b);
        
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (b * x % y == 0) {
                    int new_a = b * x / y;
                    score = Math.min(score, Math.abs(a - new_a));
                }
            }
        }
        
        System.out.println(score);
        scanner.close();
    }
}
```

Make sure to wrap the code in a class and properly import the Scanner class for reading input from the console. Additionally, the handling of standard input and output is a bit different in Java compared to Python. This Java code snippet uses the `Scanner` class for input and `System.out.println` for output. Remember to close the `Scanner` object after it is used to prevent resource leaks.
