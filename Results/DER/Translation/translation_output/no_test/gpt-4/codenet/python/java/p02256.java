Here is the equivalent Java code for the given Python program, which seems to calculate the greatest common divisor (GCD) of two integers:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split("\\s+");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        // Swapping if x is greater than y
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        // Calculating GCD
        while (x % y != 0) {
            int tempX = y;
            int tempY = x % y;
            x = tempX;
            y = tempY;
        }

        // Output the GCD
        System.out.println(y);

        scanner.close();
    }
}
```

Note that in Java, we need to explicitly create a `Scanner` object for reading input from the console. We also use `split("\\s+")` to split the input string into separate numbers using any whitespace character as the delimiter. After parsing the integers, we follow the same logic as the Python code to calculate and print out the GCD.
