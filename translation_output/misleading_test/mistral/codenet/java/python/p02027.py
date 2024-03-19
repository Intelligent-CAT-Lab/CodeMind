<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3

Expected output:
-80

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
[/INST]
```python
from collections import defaultdict

def p02027(n, k):
    total = 0
    for i in range(1, int(1 << k) + 1):
        total += search(i, k - 1, n)
    return total

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp:
        if count in dp[num]:
            return dp[num][count]
    else:
        total = 0
        for i in range(2, int(num * 2 ** (count - 1)) + 1):
            total += search(num * i, count - 1, max)
        if num in dp:
            dp[num][count] = total
        else:
            dp[num] = defaultdict(int)
            dp[num][count] = total
    return total

n = int(input())
k = int(input())
print(p02027(n, k))
```</s>
