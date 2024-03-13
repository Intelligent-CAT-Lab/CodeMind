<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();

        int N = input[0];
        int A = input[1];
        int B = input[2];
        int C = input[3];
        int D = input[4];

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && C * k - D * j <= B - A) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads five integers from the user, and then checks if there exists a pair of integers `k` and `j` such that `D*k - C*j >= B-A` and `C*k - D*j <= B-A`. If such a pair is found, it prints "YES" and breaks the loop. If no such pair is found after checking all possible pairs, it prints "NO".<｜end▁of▁sentence｜>
