Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close(); // Close the scanner
        
        int division = a / b;
        int remainder = a % b;
        double divisionFloat = (double) a / b; // Cast to double for floating-point division
        
        System.out.printf("%d %d %.6f", division, remainder, divisionFloat);
    }
}
```

Please note that Java's `System.out.printf` uses `%f` for both float and double types, and I've added `%.6f` to format the floating-point division result to 6 decimal places, which matches the default Python float representation. Also, the `Scanner` class is used for input, which takes the place of Python's `raw_input().split()`. Java requires explicit casting to double for floating-point division.
