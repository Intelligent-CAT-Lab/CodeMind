<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.print(K / 2);
            for (int i = 1; i < N; i++) {
                System.out.print(" " + K);
            }
        } else {
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = (K + 1) / 2;
            }
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    N--;
                } else {
                    X[N - 1]--;
                    for (int j = N; j < N + K - 1; j++) {
                        X[j] = K;
                    }
                    N = N + K - 1;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(" " + X[i]);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and if the first one is even, it prints half of it followed by N-1 copies of the first one. If the first one is odd, it creates an array of N elements, each of which is half of the first one plus one, and then modifies this array to make it look like the first one. Finally, it prints the modified array.
<|EOT|>
