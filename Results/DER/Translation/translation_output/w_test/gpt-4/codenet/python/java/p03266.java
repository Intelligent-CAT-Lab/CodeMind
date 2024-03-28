Below is the translated version of your Python code to Java:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int ans = 0;

        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);
    }
    
    // In the original Python code, gcd is imported but never used, so there's no need to translate that part.
}
```

To use this Java code, compile it with `javac Main.java` and then run it with `java Main`. It will wait for your input, and you should enter two numbers separated by a space (like "3 2") followed by Enter. It will then print the output which is the expected output according to your given test case.

The original Python code uses integer division which is the default in Java when dividing two integers, and the `math.pow` function is replaced with `Math.pow` in Java, requiring a cast back to an integer since `Math.pow` returns a double.

