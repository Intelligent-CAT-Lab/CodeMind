Here's the equivalent Java code based on the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int n = inputScanner.nextInt();
        int k = inputScanner.nextInt();
        
        int rot = n / k;
        int x = n;
        
        if (k == 1 || n == k || n % k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k * rot;
        }
        
        int t = x % k;
        
        System.out.println(Math.min(t, Math.abs(t - k)));
        
        inputScanner.close();
    }
}
```
The `Scanner` object is used to read input from the console, and then I followed the same logic as the provided Python code. Note that in the line where `Scanner` object is constructed, we don't specify any input string - this tells `Scanner` to read from the standard input (console). The closing of the scanner is best practice to prevent resource leaks.

Additionally, Java has strong typing, so variables need to have their types explicitly declared. The mathematical expressions and control flow structures (if/else) translate quite directly from Python to Java. Also, `System.out.println()` is the Java equivalent of Python's `print()` function for writing to standard output.

You can run this Java program and give `7 4` as input, and it will output `1`, which matches the expected output from the given test case.
