<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11121314

Expected output:
32

```
def sub(maxs, mins):
    for i in range(len(maxs)):
        if maxs[i] != mins[i]:
            if i == len(maxs)-1:
                return int(maxs[i]) - int(mins[i])
            if i == len(maxs)-2:
                return int(maxs[i:i+2]) - int(mins[i:i+2])
            return 10
    return 0

def checkEqual(S):
    ans = 8
    for k in range(1, len(S)):
        if len(S)%k != 0: continue
        mins = maxs = S[0:k]
        for s in range(0, len(S), k):
            maxs = max(maxs, S[s:s+k])
            mins = min(mins, S[s:s+k])
        ans = min(ans, sub(maxs, mins))

    return ans

def check12(S):
    maxv = 0
    minv = 10
    p = 0
    while p < len(S):
        v = int(S[p])
        if  S[p] == '1' and p+1 < len(S):
            v = 10 + int(S[p+1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
        p += 1
    return maxv - minv

S = input()
print(min(checkEqual(S), check12(S)))
                                                                                                                        

```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }

    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i) != mins.charAt(i)) {
                if (i == maxs.length() - 1) {
                    return Integer.parseInt(String.valueOf(maxs.charAt(i))) - Integer.parseInt(String.valueOf(mins.charAt(i)));
                }
                if (i == maxs.length() - 2) {
                    return Integer.parseInt(maxs.substring(i, i + 2)) - Integer.parseInt(mins.substring(i, i + 2));
                }
                return 10;
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k != 0) continue;
            String mins = S.substring(0, k);
            String maxs = mins;
            for (int s = 0; s < S.length(); s += k) {
                maxs = maxs(maxs, S.substring(s, Math.min(s + k, S.length())));
                mins = mins(mins, S.substring(s, Math.min(s + k, S.length())));
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    public static int check12(String S) {
        int maxv = 0;
        int minv = 10;
        int p = 0;
        while (p < S.length()) {
            int v = Integer.parseInt(String.valueOf(S.charAt(p)));
            if (S.charAt(p) == '1' && p + 1 < S.length()) {
                v = 10 + Integer.parseInt(String.valueOf(S.charAt(p + 1)));
                p += 1;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p += 1;
        }
        return maxv - minv;
    }

    public static String maxs(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static String mins(String a, String b) {
        return a.compareTo(b) < 0 ? a : b;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, and then prints the minimum of the results of the `checkEqual` and `check12` functions. The `checkEqual` function is a bit more complex because it has to handle substrings of the input string. The `check12` function is simpler because it just iterates over the characters of the input string.<｜end▁of▁sentence｜>
