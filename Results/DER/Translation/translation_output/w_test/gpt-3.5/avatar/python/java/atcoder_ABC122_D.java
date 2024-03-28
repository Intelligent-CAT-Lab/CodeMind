```java
import java.util.*;

public class DNASequences {
    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                char temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }
            if (String.join("", t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    static long dfs(int cur, String last3, int n, Map<Integer, Map<String, Long>> memo, int mod) {
        if (memo.containsKey(cur) && memo.get(cur).containsKey(last3)) {
            return memo.get(cur).get(last3);
        }

        if (cur == n) {
            return 1L;
        }

        long ret = 0L;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, n, memo, mod)) % mod;
            }
        }

        if (!memo.containsKey(cur)) {
            memo.put(cur, new HashMap<>());
        }
        memo.get(cur).put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) 1e9 + 7;
        Map<Integer, Map<String, Long>> memo = new HashMap<>();
        long result = dfs(0, "TTT", n, memo, mod);
        System.out.println(result);
    }
}
```
```
