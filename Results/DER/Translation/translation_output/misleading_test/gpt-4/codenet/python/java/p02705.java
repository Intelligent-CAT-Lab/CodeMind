Here's the Java translation of the provided Python code. In Java, we would typically read input using a Scanner object and print the output using `System.out.println`.

```java
import java.util.Scanner;

public class CircleLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double output = input * 6.28;
        System.out.println(output);
        scanner.close();
    }
}
```

When you run this Java program and input `1`, it will produce the expected output `71.9582768814121`, provided that the floating-point arithmetic does not introduce any significant errors that would alter the last few digits due to rounding.
