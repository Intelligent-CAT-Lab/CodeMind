Below is the translated code from Python to Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BalancedNumbers {
    private static ArrayList<Long> balancedNumbers = new ArrayList<>();
    private static final long limit = 10000000000L;

    public static void generateBalancedNumbers(long number, int fourCount, int sevenCount) {
        if (number > limit) {
            return;
        }
        if (number > 0 && fourCount == sevenCount) {
            balancedNumbers.add(number);
        }
        generateBalancedNumbers(number * 10 + 4, fourCount + 1, sevenCount);
        generateBalancedNumbers(number * 10 + 7, fourCount, sevenCount + 1);
    }

    public static void main(String[] args) {
        generateBalancedNumbers(0, 0, 0);
        Collections.sort(balancedNumbers);

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long answer = 0;

        for (long val : balancedNumbers) {
            if (val >= n) {
                answer = val;
                break;
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}
```

Please note the following changes in the Java code:
1. The list `l` changed to `ArrayList<Long>` named `balancedNumbers`.
2. Method names are in camelCase.
3. Java uses `System.out.println` for printing output, and `Scanner` class for input.
4. Java has strict type definitions and requires variable declarations for types like `long` and `int`.
5. Java uses `ArrayList` and `Collections.sort` to sort the list.
6. In Java, by convention, class names are PascalCase and start with an uppercase letter (here we used `BalancedNumbers` as the class name).
