<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
8


```
from math import factorial
MAX = 10**9+7
N, M = map(int, input().split())
diff = N-M
if abs(diff)>1:
    print(0)
elif diff == 0:
    print(factorial(N)*factorial(M)*2%MAX)
else:
    print(factorial(N)*factorial(M)%MAX)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = Math.abs(N-M);
        long result;
        if (diff > 1) {
            result = 0;
        } else if (diff == 0) {
            result = factorial(N)*factorial(M)*2 % (int)Math.pow(10,9)+7;
        } else {
            result = factorial(N)*factorial(M) % (int)Math.pow(10,9)+7;
        }
        System.out.println(result);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the absolute difference between them, and then calculates the factorial of the larger number and the smaller number, or 0 if the absolute difference is greater than 1. The result is then printed to the console.

The factorial method calculates the factorial of a number by multiplying all the integers from 1 to the number together. The factorial of 0 is defined to be 1.

Note: The factorial method uses a `long` to hold the result because the factorial of large numbers can be very large. The result of the factorial and the modulus operations are also `long`s to avoid overflow. The modulus operation is performed with the `%` operator, which gives the remainder of the division of the first number by the second number.
<|EOT|>
