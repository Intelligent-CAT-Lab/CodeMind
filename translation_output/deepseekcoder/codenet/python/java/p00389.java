<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = 1;
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

This Java code does the same thing as the Python code. It reads two integers from the input, initializes `t`, `n`, and `a` to 1, and then enters a loop where it calculates `n`, updates `a`, and increments `t` until `a` is greater than `N`. It then prints the value of `t`.
<|EOT|>
