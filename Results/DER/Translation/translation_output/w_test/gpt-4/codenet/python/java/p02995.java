Here is the equivalent Java program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        // Calculate the answer
        int ans = main(a, b, c, d);
        
        // Display the result
        System.out.println(ans);
        
        scanner.close();
    }
    
    public static int main(int a, int b, int c, int d) {
        int lcm = lcm(c, d);
        return b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
    }
    
    // Helper function to calculate LCM using the GCD
    public static int lcm(int n1, int n2) {
        return n1 / gcd(n1, n2) * n2;
    }
    
    // Helper function to calculate GCD using Euclid's algorithm
    public static int gcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;
    }
}
```

This Java program performs the same calculation as the provided Python program. It uses the `Scanner` class to read the input and encapsulates the computation logic in the `main` method along with two helper methods, `gcd` and `lcm`, to find the greatest common divisor and the least common multiple, respectively. Note that the division in the `lcm` method is rearranged to avoid potential integer overflow when multiplying `n1` and `n2` directly.
