Here's the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class BitLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        int k = (int)(Math.log(Y / X) / Math.log(2)) + 1;
        System.out.println(k);
    }
}
```

To run this code with the test input `3 20`, you would create a `BitLengthCalculator` class that expects input from the standard input (console) and prints the result to the standard output. Here is what you would expect:

Input (read via terminal/console):
```
3 20
```

Expected Output (printed to the terminal/console):
```
3
```
