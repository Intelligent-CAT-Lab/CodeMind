Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        int MAX = 1000000007;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            long result = 1;
            for (int i = N; i >= 1; i--) {
                result = (result * i) % MAX;
            }
            for (int i = M; i >= 1; i--) {
                result = (result * i) % MAX;
            }
            result = (result * 2) % MAX;
            System.out.println(result);
        } else {
            long result = 1;
            for (int i = N; i >= 1; i--) {
                result = (result * i) % MAX;
            }
            for (int i = M; i >= 1; i--) {
                result = (result * i) % MAX;
            }
            System.out.println(result);
        }
    }
}
```<|endoftext|>
