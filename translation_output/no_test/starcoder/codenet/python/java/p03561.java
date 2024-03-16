<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(K/2 + " ");
            }
        } else {
            int[] X = new int[N];
            for (int i = 0; i < N/2; i++) {
                X[i] = (K+1)/2;
            }
            for (int i = N/2; i < N; i++) {
                if (X[i-1] == 1) {
                    X[i] = 1;
                } else {
                    X[i] = X[i-1] - 1;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}
```
<|endoftext|>
