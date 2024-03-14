<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10 ** 9 + 7
i = 1
M = N
div = []
while i * i <= N:
    if N % i == 0:
        div.append(i)
        if N // i!= i:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        List<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i!= i) {
                    div.add(N / i);
                }
            }
            i++;
        }

        div.sort(Comparator.naturalOrder());
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (int i1 = 0; i1 < N1; i1++) {
            num[i1] = (int) Math.pow(K, (div.get(i1) + 1) / 2, MOD);
            for (int j = 0; j < i1; j++) {
                if (div.get(i1) % div.get(j) == 0) {
                    num[i1] -= num[j];
                    num[i1] += MOD;
                    num[i1] %= MOD;
                }
            }

            if (div.get(i1) % 2 == 0) {
                ans += div.get(i1) * num[i1] / 2;
                ans %= MOD;
            } else {
                ans += div.get(i1) * num[i1];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }
}
```
<|endoftext|>
