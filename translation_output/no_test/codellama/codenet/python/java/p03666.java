<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def inpl(): return [int(i) for i in input().split()]
N, A, B, C, D = inpl()
for k in range(N+1):
    j = N-1-k
    if D*k - C*j >= B-A >= C*k - D*j:
        print('YES')
        break
else:
    print('NO')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        for (int k = 0; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A && C * k - D * j >= B - A) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}
```
Note that the `inpl()` function is not available in Java, so we have to use the `Scanner` class to read input from the user. Also, the `range()` function is not available in Java, so we have to use a `for` loop to iterate over the values of `k`.</s>
