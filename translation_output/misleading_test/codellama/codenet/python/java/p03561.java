<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
```
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2 + " " + K + " " + K + " " + K + " " + K);
        } else {
            int X = (K + 1) / 2;
            for (int i = 0; i < N; i++) {
                if (i == N / 2) {
                    if (X == 1) {
                        X = 0;
                    } else {
                        X--;
                    }
                }
                System.out.print(X + " ");
            }
        }
    }
}
```
This is the Java code for the given Python code. The code first takes input from the user and stores it in the variables `K` and `N`. Then, it checks if `K` is even or odd and performs the necessary operations accordingly. If `K` is even, it prints the value of `K` divided by 2 followed by `N` copies of `K`. If `K` is odd, it initializes a variable `X` to `(K + 1) / 2` and then loops through the range `0` to `N - 1`. For each iteration, it checks if the current index is equal to `N / 2`. If it is, it decrements `X` by 1 and if it is not, it prints `X` followed by a space. Finally, it prints the result.</s>
