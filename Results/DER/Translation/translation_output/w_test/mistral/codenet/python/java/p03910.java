<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3


```
N = int(input())

A = []
S = 0
for i in range(1, N + 1):
    if S >= N:
        break
    S += i
    A.append(i)

x = sum(A) - N
for a in A:
    if x == a:
        continue
    print(a)

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A.add(i);
        }
        int x = A.stream().sum() - N;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}
```</s>
