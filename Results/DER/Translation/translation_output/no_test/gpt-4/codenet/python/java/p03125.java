Below is the translation of the Python code snippet into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }

        scanner.close();
    }
}
```

To run the translated Java code, a `Scanner` object is used to read two integer inputs (x and y) from the standard input (similar to `input().split()` in Python). The if-else statement operates in the same way as the Python code, determining whether y is divisible by x and then printing the appropriate result.
