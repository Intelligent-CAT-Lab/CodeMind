Below is the translated Java code that performs the same calculation as the given Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class IncrementCalculator {
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

To run the code for the given test input (103), you would compile and run the `IncrementCalculator` Java class and provide `103` as the input when prompted. The output you should expect would be `62`.

Note: Java has a different input mechanism from Python. Instead of using `input()`, we are using `Scanner` to read input from the standard input. Java's `Math.floor()` method works similar to Python's `math.floor()` for the purpose of this code translation.

Make sure when you compile and run this code, you have `Scanner` imported and that you handle input correctly to match the provided test case.
