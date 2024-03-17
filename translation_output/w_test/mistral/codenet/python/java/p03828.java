<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
4


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
    final static int MOD = (int) (1e9 + 7);
    final static int N = 100000;
    static int[] num = new int[N];
    static int ans = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            for (int j : num) {
                while (i % j == 0) {
                    count.put(j, count.getOrDefault(j, 0) + 1);
                    i /= j;
                }
                if (i == 1)
                    break;
            }
            num[i] = 1;
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        for (int k : count.values()) {
            ans = ans * (k + 1) % MOD;
        }
        System.out.println(ans);
    }
}
```</s>
