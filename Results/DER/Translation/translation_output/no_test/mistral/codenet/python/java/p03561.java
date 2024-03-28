<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, N;
        K = sc.nextInt();
        N = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2 + K * (N - 1));
        } else {
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = (K + 1) / 2;
            }
            for (int i = 0; i < N / 2; i++) {
                if (X[i] == 1) {
                    X[i] = 0;
                } else {
                    X[i]--;
                    for (int j = i + 1; j < N; j++) {
                        X[j] = K;
                    }
                }
            }
            System.out.println(X);
        }
    }
}
```</s>
