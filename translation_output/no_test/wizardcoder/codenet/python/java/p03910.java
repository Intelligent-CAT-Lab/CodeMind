Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

A = []
S = 0
for i in range(1, N + 1):
    if S >= N:
        break
    S += i
    A.append(i)

x = sum(A) - N
for a in A:
    if x == a:
        continue
    print(a)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int S = 0;
        int[] A = new int[N];
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A[i - 1] = i;
        }

        int x = 0;
        for (int i = 0; i < N; i++) {
            x += A[i];
        }
        x -= N;

        for (int i = 0; i < N; i++) {
            if (x == A[i]) {
                continue;
            }
            System.out.println(A[i]);
        }
    }
}
```<|endoftext|>
