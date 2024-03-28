<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0

Expected output:
-27

```
N, M = map(int, input().split())
a = []
for i in range(M):
    a.append(int(input()))
num = N - M
ans = 0
while(num):
    ans += 1
    num -= 1
print(ans - 1)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = scanner.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans++;
            num--;
        }
        System.out.println(ans - 1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the input, then reads M integers from the input and stores them in an array. It then calculates the difference between N and M and stores it in the variable `num`. The code then enters a while loop that continues until `num` is less than or equal to 0. Inside the loop, it increments `ans` by 1 and `num` by 1. After the loop, it prints `ans - 1` to the console.
<|EOT|>
