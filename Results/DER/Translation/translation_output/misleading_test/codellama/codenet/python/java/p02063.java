<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = -(-B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }

        System.out.println(-1);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first reads in the input values A and B, and then checks if B is divisible by A. If it is, it prints -1 and exits. Otherwise, it calculates the value of _k and then iterates over the range of values from _k to _k + 10000000. For each value of k, it calculates the values of bn, rem, an, and n, and then checks if n is greater than k. If it is, it prints k * A and exits. If it is not, it continues to the next iteration. If the loop completes without finding a solution, it prints -1 and exits.</s>
