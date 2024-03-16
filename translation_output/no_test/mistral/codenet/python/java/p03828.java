<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter

MOD = 10**9 + 7
N = int(input())
count = Counter()
ans = 1
num = []

for i in range(2, N+1):
    
    for n in num:
        while not i % n:
            count[n] += 1
            i //= n
        if i == 1:
            break
    else:
        num.append(i)
        count[i] = 1
        
for n in count.values():
    ans = ans * (n+1) % MOD
print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    final static int MOD = (int) 1e9 + 7;
    final static int N = Integer.parseInt(System.console().readLine());
    final static List<Integer> num = new ArrayList<>();
    final static Map<Integer, Integer> count = new HashMap<>();
    final static int ans = 1;

    public static void main(String[] args) {
        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1)
                    break;
            }
            num.add(i);
            count.put(i, 1);
        }
        for (int n : count.values()) {
            ans = ans * (n + 1) % MOD;
        }
        System.out.println(ans);
    }
}
```</s>
