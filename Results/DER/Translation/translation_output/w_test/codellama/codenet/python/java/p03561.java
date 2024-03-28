<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2 + " " + K * (N - 1));
        } else {
            int[] X = new int[(K + 1) / 2];
            for (int i = 0; i < N; i++) {
                if (i == N / 2) {
                    X[i] = 1;
                } else {
                    X[i] = (K + 1) / 2;
                }
            }
            System.out.println(String.join(" ", X));
        }
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `String.join()` method to print the output as a string. The logic for the program is similar to the Python code, with the main difference being the use of arrays instead of lists in Java.</s>
