Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
51

```
from math import factorial
MAX = 10**9+7
N, M = map(int, input().split())
diff = N-M
if abs(diff)>1:
    print(0)
elif diff == 0:
    print(factorial(N)*factorial(M)*2%MAX)
else:
    print(factorial(N)*factorial(M)%MAX)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            long result = 1;
            for (int i = N; i >= 1; i--) {
                result *= i;
                result %= 1000000007;
            }
            for (int i = M; i >= 1; i--) {
                result *= i;
                result %= 1000000007;
            }
            result *= 2;
            result %= 1000000007;
            System.out.println(result);
        } else {
            long result = 1;
            for (int i = N; i >= 1; i--) {
                result *= i;
                result %= 1000000007;
            }
            for (int i = M; i >= 1; i--) {
                result *= i;
                result %= 1000000007;
            }
            System.out.println(result);
        }
    }
}
```<|endoftext|>
