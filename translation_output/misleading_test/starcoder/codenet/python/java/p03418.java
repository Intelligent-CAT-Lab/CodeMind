<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2

Expected output:
69

```
N, K = map(int, input().split())
count = 0

for i in range(K + 1, N + 1):
    count += ((N + 1) // i) * (i - K) + max(0, (N + 1) % i - K)

if K == 0:
    count -= len(range(K + 1, N + 1))

print (count)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K) + Math.max(0, (N + 1) % i - K);
        }
        if (K == 0) {
            count -= N - K;
        }
        System.out.println(count);
    }
}
```
'''
<|endoftext|>
