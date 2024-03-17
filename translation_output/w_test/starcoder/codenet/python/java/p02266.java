<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
\\//

Expected output:
4
1 4


```
def func(c):
    global cnt
    cnt += {'_':0, '/':1, '\\':-1}[c]
    return cnt

cnt = 0
g = [[0, False]] + [[func(c), False] for c in input()]

gmax = g[0][0]
for i in range(1, len(g)):
    if g[i - 1][0] < g[i][0] <= gmax :
        g[i][1] = True
    gmax = max(gmax, g[i][0])

puddles = []
volume = 0
saface_level = None

for i in range(len(g) - 1, -1, -1):
    if saface_level!= None:
        volume += saface_level  - g[i][0]
        if saface_level == g[i][0]:
            puddles += [volume]
            saface_level = None
            volume = 0
    if saface_level == None and g[i][1]:
        saface_level = g[i][0] 

puddles = puddles[::-1]
print(sum(puddles))
print(len(puddles), *puddles)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        int[] dp2 = new int[n + 1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + g[i];
            max = Math.max(max, dp[i]);
        }
        int[] ans = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            if (dp[i] == max) {
                ans[i] = max;
                max--;
            } else {
                ans[i] = max;
            }
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ans[i];
        }
        System.out.println(sum);
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
'''
<|endoftext|>
