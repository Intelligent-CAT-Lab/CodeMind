Here is the equivalent Java code for your Python snippet:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        
        int g = gcd(W, H);
        int result = W * H * C / (g * g);
        
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

This Java program will read three integer inputs (just like in the Python code), calculate the greatest common divisor (using the Euclidean algorithm in the `gcd` method), and then print out the result of the given formula.
