Here's the translated Java code:

```java
import java.util.Scanner;
import java.lang.Math;

public class GrowthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        int y = 100;
        int ans = 0;
        while (y < x) {
            ans += 1;
            y = (int) Math.floor(y * 1.01);
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program captures the logic of the Python code, which takes an input number and calculates how many iterations it takes for the number `y` to grow to be at least as large as `x` given that it grows by 1% each iteration, using the `Math.floor` function to round down to the nearest integer at each step.
