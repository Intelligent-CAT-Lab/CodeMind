<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

def cnt_divisor(n):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:
            cnt += 1
    return cnt

cnt = 0
for j in range(1, n+1):
    if j % 2 == 0:
        continue
    if cnt_divisor(j) == 8:
        cnt += 1

print(cnt)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
                if (cntDivisor(j) == 8) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
```
<|EOT|>
