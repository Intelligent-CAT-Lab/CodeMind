<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 1 5 2 4

Expected output:
YESF

```
def inpl(): return [int(i) for i in input().split()]
N, A, B, C, D = inpl()
for k in range(N+1):
    j = N-1-k
    if D*k - C*j >= B-A >= C*k - D*j:
        print('YES')
        break
else:
    print('NO')
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && C * k - D * j <= B - A) {
                System.out.println("YES");
                break;
            }
        }

        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads five integers from the input, and then checks for each possible value of `k` if the condition `D*k - C*j >= B-A >= C*k - D*j` is satisfied. If it is, it prints "YES" and stops. If it doesn't find such a value for `k`, it prints "NO".
<|EOT|>
