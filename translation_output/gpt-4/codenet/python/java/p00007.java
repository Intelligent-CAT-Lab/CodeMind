Certainly! Here’s the equivalent Java code for the Python code you've given:

```java
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine()); // Assuming that the input is a valid integer
        double ans = 100000;

        for (int i = 0; i < iterations; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }

        System.out.println((int)ans);
        scanner.close();
    }
}
```
Remember, when porting code from Python to Java, we consider the typing differences (Java is a statically-typed language, unlike Python which is dynamically-typed) and also the different ways Java handles input and output.
