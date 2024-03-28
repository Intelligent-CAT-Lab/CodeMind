<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2 1 10

```
# seishin.py
K, N = map(int, input().split())
if K % 2 == 0:
    print(*[K//2] + [K]*(N-1))
else:
    X = [(K+1)//2] * N
    for i in range(N//2):
        if X[-1] == 1:
            X.pop()
        else:
            X[-1] -= 1
            X.extend([K]*(N-len(X)))
    print(*X)

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            System.out.println(Arrays.stream(arr).sum() / 2 + Arrays.stream(arr).skip(1).limit(N - 1).sum());
        } else {
            int mid = N / 2;
            int[] temp = new int[N];
            for (int i = 0; i < N; i++) {
                temp[i] = arr[i];
            }
            for (int i = mid; i < N; i++) {
                temp[i] = temp[i - mid] - 1;
            }
            for (int i = 0; i < mid; i++) {
                if (temp[i] == 1) {
                    temp[i] = 0;
                }
            }
            System.out.println(Arrays.stream(temp).sum());
        }
    }
}
```</s>
