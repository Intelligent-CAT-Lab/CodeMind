Below is the translated Java code for the given Python code. The Python code is making use of some utility functions to perform certain operations, such as reading from stdin, creating multidimensional arrays, and calculating the greatest common divisor. Java, however, has a different syntax and does not have these functions built-in, so we need to write the corresponding Java code to handle input and perform the computations.

```java
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int result = (N - gcd(N, X)) * 3;
        System.out.println(result);
    }
    
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

Please note that the Java code does not include the utility functions to create multidimensional arrays and ceil, as they are not used to solve the given problem for the specific test case provided. The code reads two integers `N` and `X` from stdin, computes `(N - gcd(N, X)) * 3`, and prints the result, which is the translated logic of the Python code provided.
