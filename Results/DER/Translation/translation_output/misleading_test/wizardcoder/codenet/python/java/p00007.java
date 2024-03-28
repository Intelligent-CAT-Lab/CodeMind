Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
130038

```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000!= 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}
```<|endoftext|>
