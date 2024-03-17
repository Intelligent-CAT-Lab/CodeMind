<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
6


```
N, K = map(int, input().split())
MOD = 10 ** 9 + 7
i = 1
M = N
div = []
while i * i <= N:
    if N % i == 0:
        div.append(i)
        if N // i != i:
            div.append(N // i)
    i += 1


div = sorted(div)
N1 = len(div)
num = [0] * (N1 + 1)
ans = 0
for i in range(N1):
    num[i] = pow(K, (div[i] + 1) // 2, MOD)
    for j in range(i):
        if div[i] % div[j] == 0:
            num[i] = num[i] - num[j] + MOD
            num[i] %= MOD

    if div[i] % 2 == 0:
        ans += div[i] * num[i] // 2
        ans %= MOD
    else:
        ans += div[i] * num[i]
        ans %= MOD

print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = 1000000007;
        int i = 1;
        int M = N;
        List<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
            i++;
        }
        div.sort(Collections.reverse(div));
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        long ans = 0;
        for (int j = 0; j < N1; j++) {
            num[j] = (int) Math.pow(K, (div.get(j) + 1) / 2, MOD);
            for (int k = 0; k < j; k++) {
                if (div.get(j) % div.get(k) == 0) {
                    num[j] = num[j] - num[k] + MOD;
                    num[j] %= MOD;
                }
            }
            if (div.get(j) % 2 == 0) {
                ans += div.get(j) * num[j] / 2;
                ans %= MOD;
            } else {
                ans += div.get(j) * num[j];
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }
}
```</s>
