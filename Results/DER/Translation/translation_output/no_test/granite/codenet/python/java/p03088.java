System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
N, MOD = int(input()), 10 ** 9 + 7
memo = [{} for i in range(N + 1)]


def ok(last4):
    for i in range(4):
        # tã®åæå
        t = list(last4)

        if i >= 1:
            # æå­ã®å¥ãæ¿ã
            t[i - 1], t[i] = t[i], t[i - 1]

        if "".join(t).count("AGC") >= 1:
            return False

    return True


def dfs(cur, last3):
    # æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
    # ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåå©ç¨
    if last3 in memo[cur]:
        return memo[cur][last3]

    if cur == N:
        return 1
    ret = 0

    for c in "ACGT":
        if ok(last3 + c):
            # ok ã®å ´åcount ãå¢ãã
            # 1åãããã¦ curãå¢ãã
            ret = (ret + dfs(cur + 1, last3[1:] + c)) % MOD
    memo[cur][last3] = ret

    return ret


print(dfs(0, "TTT"))

```


Answer:
```java
import java.util.*;

public class Main {
    static int N, MOD = 100000007;
    static Map<String, Integer>[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        memo = new HashMap[N + 1][4];

        System.out.println(dfs(0, "TTT"));
        sc.close();
    }

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            // tã®åæå
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // æå­ã®å¥ãæ¿ã
                char tmp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = tmp;
            }

            if (new String(t).contains("AGC")) {
                return false;
            }
        }

        return true;
    }

    static int dfs(int cur, String last3) {
        // æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
        // ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåå©ç¨
        if (memo[cur][last3.charAt(0) - 'A']!= null) {
            return memo[cur][last3.charAt(0) - 'A'];
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                // ok ã®å ´åcount ãå¢ãã
                // 1åãããã¦ curãå¢ãã
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur][last3.charAt(0) - 'A'] = ret;

        return ret;
    }
}
```<|endoftext|>
