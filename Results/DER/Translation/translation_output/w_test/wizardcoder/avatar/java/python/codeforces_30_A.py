Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

def main():
    A, B, N = map(int, input().split())
    for x in range(-1000, 1001):
        if is_power(x, N) and x*A == B:
            print(x)
            return
    print("No solution")

if __name__ == '__main__':
    main()
```

Explanation:

We first define a helper function `is_power(x, n)` that checks if `x` is a power of `n`. We use the fact that if `x` is a power of `n`, then `x^n` is equal to `1` modulo `n`. We use this fact to check if `x` is a power of `n`.

In the `main()` function, we read the input values `A`, `B`, and `N` from the user. We then loop over all integers `x` in the range `-1000` to `1000`. For each `x`, we check if `x` is a power of `N` and if `x*A` is equal to `B`. If both conditions are true, we print `x` and return. If we loop through all integers and don't find a solution, we print "No solution".<|endoftext|>
