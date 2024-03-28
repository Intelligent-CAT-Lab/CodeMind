<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int MOD = 1000000007;
        int ans = 1;
        ArrayList<Integer> num = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) break;
            } else {
                num.add(i);
                count.put(i, 1);
            }
        }
        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
