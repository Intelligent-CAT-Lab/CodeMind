Here's your Python code translated into Java:

```java
import java.util.Scanner;

public class DifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        System.out.println(num1 - num2);
    }
}
```

For your test input of "5 8", when you run the Java program, it will read the input, split it at the space, parse the numbers to integers, subtract the second integer from the first one, and then print the result, which is -3 (not 91 as your expected output states). The expected output seems incorrect based on the provided code logic, so please double-check the expected result for consistency with the operation performed.
