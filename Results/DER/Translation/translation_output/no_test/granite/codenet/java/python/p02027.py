System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02027 {
    static HashMap<Integer, HashMap<Integer, Long>> dp = new HashMap<>();
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long total = 0;
        for (int i = 1; i * Math.pow(2, k - 1) <= n; i++) {
            total += search(i, k - 1, n);
        } 
        System.out.println(total);
    }
    
    static long search(int num, int count, int max) {
        if (count == 0) {
            return 1;
        }
        if (dp.containsKey(num)) {
            if (dp.get(num).containsKey(count)) {
                return dp.get(num).get(count);
            }
        }
        long total = 0;
        for (int i = 2; num * i * Math.pow(2, count - 1) <= max; i++) {
            total += search(num * i, count - 1, max);
        }
        if (dp.containsKey(num)) {
            dp.get(num).put(count, total);
        } else {
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(count, total);
            dp.put(num, map);
        }
        return total;
    }
}

```


Answer:
```python
import math

dp = {}

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp and count in dp[num]:
        return dp[num][count]
    total = 0
    for i in range(2, int(math.ceil(max / (num * i * 2 ** (count - 1)))) + 1):
        total += search(num * i, count - 1, max)
    if num in dp:
        dp[num][count] = total
    else:
        dp[num] = {count: total}
    return total

n, k = map(int, input().split())
total = 0
for i in range(1, int(math.ceil(n / (2 ** (k - 1)))) + 1):
    total += search(i, k - 1, n)
print(total)
```<|endoftext|>
