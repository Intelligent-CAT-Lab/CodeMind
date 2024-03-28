<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def codeforces_30_A(A, B, N):
    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            return x
    return "No solution"

# Test input
A = 7
B = 896
N = 7

# Call the function with test input
print(codeforces_30_A(A, B, N))
```

This Python code does the same thing as the Java code. It takes three inputs A, B, and N, and then it iterates over the range from -1000 to 1000. For each number x in this range, it checks if x raised to the power N times A equals B. If it does, it returns x. If it doesn't find a solution in this range, it returns "No solution".
<|EOT|>
