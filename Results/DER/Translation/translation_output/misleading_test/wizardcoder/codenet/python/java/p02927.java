Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15 40

Expected output:
-56

```
m,d = map(int,input().split())
ans = 0
for i in range(22,d+1):
  d0 = i%10
  d1 = int(i/10)
  if d0 == 1 or d0 == 0:
    continue
  if m >= d0 * d1:
    ans += 1
    #print(i)
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
