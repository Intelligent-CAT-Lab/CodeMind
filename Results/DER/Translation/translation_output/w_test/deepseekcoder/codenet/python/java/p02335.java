<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
10


```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    static long MOD = (long)Math.pow(10,9)+7;

    static long P(long n, long r) {
        return factorial(n) / factorial(n-r);
    }

    static long factorial(long n) {
        long fact = 1;
        for(long i = 1; i <= n; ++i) {
            fact *= i;
        }
        return fact;
    }

    static long C(long n, long r) {
        return P(n,r) / factorial(r);
    }

    static long H(long n, long r) {
        return C(n+r-1,r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if(n < k) {
            System.out.println(C(k,n) % MOD);
        } else if(n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two long integers from the input, and then it prints the result of the C function (which is a combination function) if the first number is less than the second, otherwise it prints 0 if the first number is greater than the second, and 1 if they are equal. The result is taken modulo MOD to prevent overflow.
<|EOT|>
