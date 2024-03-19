<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
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
            int[] X = new int[(K + 1) / 2];
            for (int i = 0; i < N; i++) {
                X[i % X.length]++;
                if (X[X.length - 1] == 1) {
                    X = removeLastElement(X);
                } else {
                    X[X.length - 1]--;
                    int[] newX = new int[N];
                    System.arraycopy(X, 0, newX, 0, X.length);
                    for (int j = X.length; j < N; j++) {
                        newX[j] = K;
                    }
                    X = newX;
                }
            }
            for (int i : X) {
                System.out.print(" " + i);
            }
        }
    }

    private static int[] removeLastElement(int[] array) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, array.length - 1);
        return newArray;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and if the first one is even, it prints half of it followed by the first one repeated N-1 times. If the first one is odd, it creates an array of half of it, and then modifies this array to have the first one repeated N times. If the last element of the array becomes 1, it removes it. Otherwise, it decreases the last element by 1 and adds the first one to the rest of the array.
<|EOT|>
