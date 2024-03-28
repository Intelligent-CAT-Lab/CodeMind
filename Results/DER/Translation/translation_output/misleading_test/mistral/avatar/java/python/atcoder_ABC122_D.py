<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99

Expected output:
597534494

```
import java.util.*;
import java.io.*;

public class atcoder_ABC122_D {
    int N;
    long MOD = 1000000007L;
    String[] TOKENS = {"A", "C", "G", "T"};
    Map<String, Long>[] memo;

    atcoder_ABC122_D() {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.close();
        this.memo = new Map[N + 1];
        for (int i = 0; i < this.memo.length; ++i) {
            this.memo[i] = new HashMap<String, Long>();
        }
    }

    long calc() {
        return dfs(0, "TTT");
    }

    boolean isOK(String last4) {
        if (last4.contains("AGC")) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            char[] vals = last4.toCharArray();
            vals[i] = last4.charAt(i + 1);
            vals[i + 1] = last4.charAt(i);
            String s = new String(vals);
            if (s.contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    long dfs(int current, String last3) {
        if (this.memo[current].containsKey(last3)) {
            return (Long) (this.memo[current].get(last3));
        }
        if (current == N) {
            return 1;
        }
        long result = 0;
        for (String c : TOKENS) {
            if (isOK(last3 + c)) {
                result = (result + dfs(current + 1, last3.substring(1, last3.length()) + c)) % MOD;
            }
        }
        memo[current].put(last3, result);
        return result;
    }

    public static void main(String[] args) {
        atcoder_ABC122_D ins = new atcoder_ABC122_D();
        System.out.println(ins.calc());
    }
}
```
[/INST]
```python
import sys

N = int(input())
MOD = 1000000007
TOKENS = ["A", "C", "G", "T"]

def calc():
    return dfs(0, "TTT")

def isOK(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        vals = list(last4)
        vals[i], vals[i+1] = vals[i+1], vals[i]
        s = "".join(vals)
        if "AGC" in s:
            return False
    return True

def dfs(current, last3):
    if (last3 in memo[current]):
        return memo[current][last3]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if isOK(last3 + c):
            result = (result + dfs(current+1, last3[1:] + c)) % MOD
    memo[current][last3] = result
    return result

if __name__ == "__main__":
    memo = [{} for _ in range(N+1)]
    ins = atcoder_ABC122_D()
    print(ins.calc())
```</s>
