Here's how you can translate the Python code to Java:

```java
import java.util.Scanner;

public class GcdSum {
    // Java method to find GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int result = a + b - gcd(a, b) + 1;
        
        System.out.println(result);
    }
}
```

To run a test case, you simply need to execute the Java program and provide input. The program reads from the standard input, calculates the desired output, and prints it to the standard output.

For custom inputs like the test case provided (4 4), you need to run the program and type in '4 4' when prompted for input to see if it produces the expected output of '5'.
