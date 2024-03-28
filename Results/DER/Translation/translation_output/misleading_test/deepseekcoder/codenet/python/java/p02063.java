<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
-12

```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            System.exit(0);
        }

        int _k = (int) Math.ceil((double) B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int rem = k * A % B;
            int an = rem / A;
            int n = k + an + rem % A;
            if (n > k) {
                System.out.println(k * A);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if the second integer is divisible by the first one, and if not, it calculates the smallest possible value of the product of the two integers such that the sum of the digits of the product is greater than the value of the integer itself. If such a value does not exist, it prints -1.
<|EOT|>
