Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
K, A, B = map(int, input().split())
if A <= B and K > A:
    print(-1)
elif A >= K:
    print(1)
else:
    print(1 - int(- (K-A) // (A-B))*2)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            int numerator = K - A;
            int denominator = A - B;
            int quotient = numerator / denominator;
            int remainder = numerator % denominator;
            int result = 1 - quotient * 2;
            if (remainder > 0) {
                result -= 1;
            }
            System.out.println(result);
        }
    }
}
```<|endoftext|>
