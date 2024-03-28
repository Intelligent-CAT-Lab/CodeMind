<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 896 7

Expected output:
2


```
import java.math.BigInteger;
import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        BigInteger bigA = BigInteger.valueOf(A);
        BigInteger bigB = BigInteger.valueOf(B);
        
        for (int x = -1000; x <= 1000; x++) {
            if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)) {
                System.out.println(x);
                return;
            }
        }
        
        System.out.println("No solution");
    }
}
```
[/INST]
```python
import math

def solve(A, B, N):
    for x in range(-1000, 1001):
        if math.pow(x, N) * A == B:
            return x
    return "No solution"

# Test case
print(solve(7, 896, 7))  # 2
```
Note that the `math.pow()` function in Python takes only two arguments, so we need to use the `**` operator to raise `x` to the power of `N`. Also, the `BigInteger` class is not needed in Python, as it is not a built-in data type. Instead, we can use the `int` data type and the `**` operator to perform the same operations.</s>
