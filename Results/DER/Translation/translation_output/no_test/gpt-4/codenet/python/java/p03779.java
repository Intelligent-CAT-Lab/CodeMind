Here's the equivalent Java code for the Python code you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input value for x
        int x = sc.nextInt();
        
        // Solve the quadratic equation
        int t = (int)(-1 + Math.sqrt(1 + 8 * (long)x)) / 2;
        
        // Check and print the result based on the condition
        if (t * (t+1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t+1);
        }
        
        sc.close();
    }
}
```

Please note the following adjustments I've made for the conversion to Java:

1. I've used `Scanner` to read an integer from the standard input, which is equivalent to `input()` in Python.
2. The arithmetic operations are directly converted to Java syntax with appropriate type casting.
3. Instead of `**` for exponentiation in Python, I've used `Math.sqrt()` for the square root in Java.
4. The `//` operator in Python, which performs floor division, is equivalent to `/` in Java when used with integer types, as it defaults to floor division in the case of integral types.
5. The cast `(long)` is added before `x` when calculating `8 * (long)x` to avoid integer overflow.
6. `System.out.println` is used to print the result to the console.
