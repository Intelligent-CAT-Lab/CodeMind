Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
-12

```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int k = -(-B / A);

        for (int i = k; i <= k + 10000000; i++) {
            int bn = i * A / B;
            int rem = i * A % B;
            int an = rem / A;
            int n = bn + an + rem % A;
            if (n > i) {
                System.out.println(i * A);
                return;
            }
        }
        System.out.println(-1);
    }
}
```<|endoftext|>
