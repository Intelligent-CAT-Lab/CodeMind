<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99

Expected output:
597534520

```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ], t [ i - 1 ] = t [ i - 1 ], t [ i ]
        if''. join ( t ). count ('AGC') >= 1 :
            return False
    return True
def dfs ( cur, last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in " ACGT " :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1, last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0,'TTT') )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        int[][] memo = new int[n + 1][4];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(dfs(0, "TTT", memo));
    }

    public static int dfs(int cur, String last3, int[][] memo) {
        if (memo[cur][last3.charAt(0) - 'A']!= -1) {
            return memo[cur][last3.charAt(0) - 'A'];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            String c = "ACGT".charAt(i) + "";
            if (ok(last3.substring(1) + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(0, 1) + c, memo)) % mod;
            }
        }
        memo[cur][last3.charAt(0) - 'A'] = ret;
        return ret;
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                char tmp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = tmp;
            }
            if (new String(t).replaceAll(" ", "").contains("AGC")) {
                return false;
            }
        }
        return true;
    }
}
```
<|endoftext|>
