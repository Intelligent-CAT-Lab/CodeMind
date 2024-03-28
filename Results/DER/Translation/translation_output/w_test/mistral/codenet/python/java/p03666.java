<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 1 5 2 4

Expected output:
YES


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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k = 1; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A && D * k - C * j >= B - A && C * k - D * j >= B - A) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}
```</s>
