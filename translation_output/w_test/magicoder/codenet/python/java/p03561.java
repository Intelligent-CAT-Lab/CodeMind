<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2 1


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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.print(K / 2);
            for (int i = 0; i < N - 1; i++) {
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
                    for (int j = N; j < N + (N - N / 2); j++) {
                        X[j] = K;
                    }
                    N += N - N / 2;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if the first integer is even, and then prints the appropriate output. If the first integer is even, it prints half of it followed by the first integer repeated N-1 times. If the first integer is odd, it creates an array X of N elements, each of which is half of the first integer plus one, and then modifies this array to make it look like the Python code is doing.<｜end▁of▁sentence｜>
