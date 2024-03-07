<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2);
            for (int i = 1; i < N; i++) {
                System.out.print(K);
            }
        } else {
            int X = (K + 1) / 2;
            for (int i = 0; i < N; i++) {
                if (i == N / 2) {
                    if (X == 1) {
                        System.out.print(X);
                    } else {
                        System.out.print(X - 1);
                        for (int j = 1; j < N - i; j++) {
                            System.out.print(K);
                        }
                    }
                } else {
                    System.out.print(X);
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `if` statement is used to check if `K` is even or odd, and the `for` loop is used to print the output.</s>
