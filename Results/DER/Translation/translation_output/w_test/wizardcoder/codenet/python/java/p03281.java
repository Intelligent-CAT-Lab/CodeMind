Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
105

Expected output:
1


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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            int divisorCount = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount == 8) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
```<|endoftext|>
