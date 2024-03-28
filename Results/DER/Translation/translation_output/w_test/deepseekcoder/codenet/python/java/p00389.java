<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = 0;
        int n = 1;
        int a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t += 1;
        }
        System.out.println(t);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the number of iterations `t` until `a` exceeds `N`, and prints the result.
<|EOT|>
