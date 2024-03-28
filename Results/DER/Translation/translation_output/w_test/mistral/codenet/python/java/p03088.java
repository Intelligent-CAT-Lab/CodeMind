<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
61


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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;
        Map<Integer, Map<String, Integer>> memo = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            memo.put(i, new HashMap<>());
        }

        boolean ok(String last4) {
            for (int i = 0; i < 4; i++) {
                // å³æå
                String t = last4;

                if (i > 0) {
                    // æå­ã®åญ¥ãæ¿ã
                    t = t.substring(1) + t.charAt(0);
                }

                if (t.contains("AGC")) {
                    return false;
                }
            }
            return true;
        }

        int dfs(int cur, String last3) {
            // æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
            // ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåodiå©çuce
            if (last3.equals(memo.get(cur).get("TTT"))) {
                return memo.get(cur).get("TTT");
            }

            if (cur == N) {
                return 1;
            }
            int ret = 0;

            for (char c : "ACGT".toCharArray()) {
                if (ok(last3 + c)) {
                    // ok ã®å ´åatså¢ãã
                    // 1åãããã¦ curãå¢ãã
                    ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
                }
            }
            memo.get(cur).put("TTT", ret);

            return ret;
        }

        System.out.println(dfs(0, "TTT"));
    }
}
```</s>
