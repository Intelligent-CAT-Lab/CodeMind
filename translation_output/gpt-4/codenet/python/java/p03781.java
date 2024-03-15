Below is the Java translation of the given Python code. In Java, the equivalent of Python's `input()` function is using a `Scanner` to read from the standard input. Also, `Math.sqrt()` and `Math.floor()` are the equivalent methods for `math.sqrt()` and `math.floor()` in Python. The integer division is done by using the `/` operator with operands that are integers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println(x + 1);
        }
        
        scanner.close();
    }
}
```

Remember to handle exceptions or user input errors as needed, depending on how robust you want your program to be.
