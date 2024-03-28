<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int C = Integer.parseInt(input[3]);
        int D = Integer.parseInt(input[4]);

        for (int k = 1; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A >= C * k - D * j) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}
```</s>
