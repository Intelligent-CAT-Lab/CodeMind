<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int N, MOD = (int) Math.pow(10, 9) + 7;
    static Map<String, Integer>[] memo;

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            StringBuilder t = new StringBuilder(last4);
            if (i >= 1) {
                char temp = t.charAt(i - 1);
                t.setCharAt(i - 1, t.charAt(i));
                t.setCharAt(i, temp);
            }
            if (t.toString().contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == N) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        memo = new HashMap[N + 1];
        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `N` from the standard input, then it prints the number of valid strings of length `N` that can be formed by appending one character from `"ACGT"` to the end of any of the last three characters. The result is taken modulo `10^9 + 7` to prevent overflow.
<|EOT|>
