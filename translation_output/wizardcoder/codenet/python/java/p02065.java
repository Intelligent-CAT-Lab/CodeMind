Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter
N, K, mod = map(int, input().split())
dp = [Counter() for _ in range(2*N)]

dp[0][(None, (0,))] = 1
for i in range(2*N-1):
    for (left, top), v in dp[i].items():
        if len(top) > K+1:
            continue
        if left == None:
            if top and i+1 - top[0] <= K:
                dp[i+1][(i+1, top)] = (dp[i+1][(i+1, top)] + v) % mod 
        elif (i+1 - left <= K) and len(top) > 1 and (i+1 - top[1] <= K):
            dp[i+1][(i+1, top[1:])] = (dp[i+1][(i+1, top[1:])] + v) % mod
        if top and (i+1 - top[-1] <= K):
            top = list(top)
            top.append(i+1)
            top = tuple(top)
            dp[i+1][(left, top)] = (dp[i+1][(left, top)] + v) % mod

res = 0
for (left, top), v in dp[2*N-1].items():
    if len(top) == 1:
        assert left == 2*N - 1
        res = (res + v) % mod
print(res)


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int)1e9 + 7;
        Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();
        for (int i = 0; i < 2*N; i++) {
            dp.put(i, new HashMap<>());
        }
        dp.get(0).put(0, 1);
        for (int i = 0; i < 2*N-1; i++) {
            for (Map.Entry<Integer, Integer> entry : dp.get(i).entrySet()) {
                int left = entry.getKey();
                int[] top = new int[entry.getValue()];
                dp.get(i+1).put(left, (dp.get(i+1).getOrDefault(left, 0) + entry.getValue()) % mod);
                if (left == -1) {
                    if (top.length > 0 && i+1 - top[0] <= K) {
                        dp.get(i+1).put(i+1, (dp.get(i+1).getOrDefault(i+1, 0) + entry.getValue()) % mod);
                    }
                } else {
                    if (top.length > 1 && i+1 - top[1] <= K) {
                        dp.get(i+1).put(i+1, (dp.get(i+1).getOrDefault(i+1, 0) + entry.getValue()) % mod);
                    }
                    if (top.length > 0 && i+1 - top[0] <= K) {
                        int[] newTop = Arrays.copyOfRange(top, 1, top.length);
                        dp.get(i+1).put(left, (dp.get(i+1).getOrDefault(left, 0) + entry.getValue()) % mod);
                        dp.get(i+1).put(i+1, (dp.get(i+1).getOrDefault(i+1, 0) + entry.getValue()) % mod);
                    }
                }
                if (top.length > 0 && i+1 - top[top.length-1] <= K) {
                    int[] newTop = Arrays.copyOf(top, top.length+1);
                    newTop[newTop.length-1] = i+1;
                    dp.get(i+1).put(left, (dp.get(i+1).getOrDefault(left, 0) + entry.getValue()) % mod);
                    dp.get(i+1).put(i+1, (dp.get(i+1).getOrDefault(i+1, 0) + entry.getValue()) % mod);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : dp.get(2*N-1).entrySet()) {
            int left = entry.getKey();
            int[] top = new int[entry.getValue()];
            if (left == 2*N-1 && top.length == 1) {
                res = (res + entry.getValue()) % mod;
            }
        }
        System.out.println(res);
    }
}
```<|endoftext|>
