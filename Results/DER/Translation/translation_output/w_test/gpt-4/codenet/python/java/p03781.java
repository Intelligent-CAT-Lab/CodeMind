Here is the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong(); // Assumed input to be of type long for larger numbers.
        long result;

        double sqrtVal = Math.sqrt(8 * x + 1);
        if (sqrtVal == Math.floor(sqrtVal)) {
            result = (long) ((-1 + sqrtVal) / 2);
            System.out.println(result);
        } else {
            result = (long) ((-1 + sqrtVal) / 2);
            System.out.println(result + 1);
        }

        scanner.close();
    }
}
```

Please note that in Java, floating-point numbers are by default of type `double`, and the `Scanner` class is used for taking input from the console. I've assumed that the `x` variable can be large, so I used `long` to accommodate larger numbers that can fit within the limits of a 64-bit signed integer.
