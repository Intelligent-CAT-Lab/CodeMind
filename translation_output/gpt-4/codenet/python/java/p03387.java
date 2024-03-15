Below is the Java version of the given Python code. Java requires more boilerplate, such as class declaration, method declaration, and explicit variable type definition. Also, Java does not support packing and unpacking of variables as Python does, so the statement `a, b, c = map(int, input().split())` must be handled differently in Java. Similarly, explicit casting is needed when dividing two integers to obtain another integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Splitting the input line and converting to integers
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        // Finding max and min the conventional way as Java doesn't have built-in max/min for 3 values
        int x = Math.max(a, Math.max(b, c));
        int y = Math.min(a, Math.min(b, c));

        // Computing z based on the sum of a, b, and c minus x and y
        int z = a + b + c - x - y;

        // Checking the condition and printing the result
        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }

        scanner.close();
    }
}
```

Please note that the `Scanner` class is used for input, and `System.out.println()` is used for output. The arithmetic operations are similar, but explicit casting is omitted since the division of two integers in Java naturally results in an integer. The input expects a line with three integers, separated by spaces, just like the Python code expects.
