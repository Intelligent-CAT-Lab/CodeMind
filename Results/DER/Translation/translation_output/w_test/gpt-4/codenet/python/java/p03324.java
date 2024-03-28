Here's the equivalent Java code for the given Python example. Make sure to use the `Scanner` class to read input from the user and to import it before usage.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        
        if (N != 100) {
            System.out.println((int)Math.pow(100, D) * N);
        } else {
            System.out.println((int)Math.pow(100, D) * (N + 1));
        }
        
        scanner.close();
    }
}
```

This code will produce the expected output when provided with the test input "0 5". In Java, we explicitly import the `Scanner` class for reading input and close it after use to prevent resource leaks. We also use `Math.pow` to replicate Python's power (`**`) operator. Since `Math.pow` returns a double, we cast it to an int, assuming that the power operation will not result in a number larger than `Integer.MAX_VALUE`.

Please note that for very large exponents, this code could cause an integer overflow leading to incorrect results. For handling very large numbers, you would typically use `BigInteger`, but this is beyond the scope of this specific example.
