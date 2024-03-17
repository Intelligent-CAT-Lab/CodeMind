<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
4


```
N = int(input())

ans, k = 1, 0
for i in range(2, N+1, 2):
    temp, res = i, 0
    while temp%2 == 0:
        res += 1
        temp //= 2
    if k < res:
        ans = i
        k = res
print(ans)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int ans = 1, k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i, res = 0;
            while (temp % 2 == 0) {
                res += 1;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` from the input, then it iterates over all even numbers from 2 to `N`. For each even number, it counts how many times it can be divided by 2 before it becomes odd. If the count is greater than the current maximum count `k`, it updates `k` and `ans`. Finally, it prints `ans`.
<|EOT|>
