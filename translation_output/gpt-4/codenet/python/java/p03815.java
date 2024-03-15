Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = x / 11; // In Java, integer division already discards the fractional part
        x = x - 11 * n;

        if (x == 0) {
            System.out.println(2 * n);
        } else if (1 <= x && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }

        scanner.close();
    }
}
```

The imports and class definition are necessary in Java to properly structure the code for execution. The `Scanner` is the Java equivalent of Python's `input` function, used to obtain input from the user. Java also uses strict type declaration, so variables must have their types specified. Additionally, in Java, you do not need to explicitly perform floor division (using `//` in Python) if you are dividing two integers – it automatically performs integer division, similar to the Python `//` operator.
