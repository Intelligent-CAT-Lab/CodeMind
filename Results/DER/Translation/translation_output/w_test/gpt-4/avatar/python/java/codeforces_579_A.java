Below is the translated Python code into Java, complete with a main method for running a simple test with input and displaying the expected output:

```java
import java.util.Scanner;
import java.lang.Math;

public class LogCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        
        while (Math.log(n) / Math.log(2) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) (Math.log(n) / Math.log(2)));
        }
        
        System.out.println(x);
        scanner.close();
    }
}
```

To simulate the test input and expected output in a Java environment, you can manually input the test case value '9' when prompted by the program, and the expected output '2' should be displayed in the console.

Please note that in Java, there is no direct equivalent for Python's `math.log2()` function, so instead, I used `Math.log(n) / Math.log(2)`, which achieves the same result since `log2(n)` is mathematically equivalent to `log(n)/log(2)`.
