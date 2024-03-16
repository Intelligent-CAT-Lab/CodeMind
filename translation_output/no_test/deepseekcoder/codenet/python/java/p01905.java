<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code you provided. It reads two integers N and M from the input, then reads M more integers from the input. It then calculates the difference between N and M and counts how many times that difference can be reduced by 1 before it reaches 0. The result is then printed to the console.
<|EOT|>
