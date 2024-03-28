Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 896 7

Expected output:
13

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
import math

def is_power(x, n):
    if x == 0:
        return False
    elif x == 1:
        return True
    elif n == 1:
        return True
    elif n % 2 == 0:
        return is_power(x*x, n//2)
    else:
        return is_power(x*x, n//2) or x == n

def find_power(A, B, N):
    for x in range(-1000, 1001):
        if is_power(x, N) and x*A == B:
            return x
    return "No solution"

A = int(input())
B = int(input())
N = int(input())

print(find_power(A, B, N))
```

Explanation:

We can use the `is_power` function to check if a number is a power of a given number. We can then use a loop to iterate over all possible values of `x` and check if `x^N * A == B`. If we find a solution, we return it. If we reach the end of the loop without finding a solution, we return "No solution".<|endoftext|>
