Below is the translated code from Python to Java that performs the same functionality:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(lcm(A, B));
        sc.close();
    }
    
    // Method to compute the greatest common divisor (Euclid's algorithm)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    // Method to compute the least common multiple
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
```

To run the program, you will need to compile and execute the `Main` class. When executing, it will wait for input from the user. You should provide two integers separated by a space, exactly as the Python script would expect. After entering the input, the program will output the least common multiple of the two numbers.

Note: Java performs integer division in the `lcm` method just like the Python `//` operator, so the result will be an integer. Java's arithmetic `/` when applied to integers will discard any remainder and return a rounded-down integer.
