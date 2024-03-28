Here's how you would translate the provided Python code to Java code:

```java
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int periods = scanner.nextInt();
        double ans = 100000;

        for (int i = 0; i < periods; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0)
                ans += 1000 - ans % 1000;
        }

        System.out.println((int) ans);
        scanner.close();
    }
}
```

Before running the program, make sure to provide input to the console when prompted. The program reads an `int` value from the console for the number of periods and computes the resultant `ans` accordingly, rounding it up to the nearest thousand as in the Python code.

To run this test case with an input of `5`, you need to enter `5` when the program prompts, and the expected output will be `130000` as in the expected output from the Python code.
