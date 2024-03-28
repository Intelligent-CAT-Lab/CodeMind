<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99

Expected output:
597534442


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ' ' . join ( t ) . count ( ' AGC ' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in " ACGT " :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , ' TTT ' ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int mod = (int)Math.pow(10, 9) + 7;
    static Map<String, Integer>[] memo;
    static int n;

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            String[] t = last4.split("");
            if (i >= 1) {
                String temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }
            if (String.join("", t).replace(" ", "").contains("AGC"))
                return false;
        }
        return true;
    }

    public static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3))
            return memo[cur].get(last3);
        if (cur == n)
            return 1;
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3.substring(1) + c))
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % mod;
        }
        memo[cur].put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++)
            memo[i] = new HashMap<>();
        System.out.println(dfs(0, "TTT"));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, initializes the `memo` array, and then calls the `dfs` function to compute the result. The `ok` function checks if a string is valid according to the rules of the problem. The `dfs` function is a depth-first search that recursively explores all possible strings of length `n` that satisfy the `ok` function. The result is then printed to the standard output.
<|EOT|>
