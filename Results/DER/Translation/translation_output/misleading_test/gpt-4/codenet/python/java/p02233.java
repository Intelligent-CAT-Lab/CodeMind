Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Getting the input from user
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }
        System.out.println(a);
        scanner.close();
    }
}
```

To test with the input "3", you can run the Java program and provide the input when prompted. According to the given Python code, it should print "86" as the expected output.
