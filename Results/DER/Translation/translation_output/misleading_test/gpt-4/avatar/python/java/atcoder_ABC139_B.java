Here is the Python code translated into Java, including an example to read input from `System.in` and output the result:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println(((h - 2) / (t - 1)) + 1);
        scanner.close();
    }
}
```

This code expects two integers as input, similar to the sample test case you provided. The calculations and logic are directly translated from the Python code. Note that the division performed in Java is integer division if both `t` and `h` are integers, just like `//` in Python.
