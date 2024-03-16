Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def inpl(): return [int(i) for i in input().split()]
N, A, B, C, D = inpl()
for k in range(N+1):
    j = N-1-k
    if D*k - C*j >= B-A >= C*k - D*j:
        print('YES')
        break
else:
    print('NO')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        int N = nums[0], A = nums[1], B = nums[2], C = nums[3], D = nums[4];
        for (int k = 0; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A && B - A >= C * k - D * j) {
                System.out.println("YES");
                break;
            }
        } else {
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
