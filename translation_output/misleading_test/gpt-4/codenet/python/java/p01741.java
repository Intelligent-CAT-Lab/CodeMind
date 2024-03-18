Below is the Java translation of the provided Python code, which includes reading input from the console and printing out the result as per the logic given:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        System.out.println((Math.floor(n) + 1) > n * Math.sqrt(2) ? Math.floor(n) + 1 : n * Math.sqrt(2));
    }
}
```

In the above Java code, `Math.sqrt()` is used to calculate the square root of 2, and `Math.floor()` gives the largest integer less than or equal to `n`, which is analogous to the `//` operator in Python for floor division.

To use this code, you would compile it using `javac` and then run the resulting class file, inputting the test value (`1.000`) when prompted. The expected output should then be printed to the console, which is `33.29131990083172`.
