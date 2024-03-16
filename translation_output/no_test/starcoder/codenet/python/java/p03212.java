<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

def dfs(s):
    if int(s) > n:
        return 0
    ret = 1 if all(s.count(c) > 0 for c in '753') else 0
    for c in '753':
        ret += dfs(s + c)
    return ret

print(dfs('0'))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                int num = i * 10 + j;
                if (num > n) {
                    break;
                }
                if (num % 7 == 0 && num % 5 == 0 && num % 3 == 0) {
                    dp[num] += dp[i];
                }
            }
        }

        System.out.println(dp[n]);
    }
}
```
<|endoftext|>
