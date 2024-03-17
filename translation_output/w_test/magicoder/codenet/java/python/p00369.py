<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11121314

Expected output:
3


```
import java.util.*;

class p00369{
    int val(char ch){ return ch-'0';}

    int sub(String maxs, String mins){
        for ( int i = 0; i < maxs.length(); i++ ){
            if ( maxs.charAt(i) != mins.charAt(i) ) {
                if ( i == maxs.length()-1 )
                    return val(maxs.charAt(i)) - val(mins.charAt(i));
                if ( i == maxs.length()-2 )
                    return (10*val(maxs.charAt(i))+val(maxs.charAt(i+1))) - (10*val(mins.charAt(i))+val(mins.charAt(i+1)));
                return 10;
            }
        }
        return 0;
    }

  int checkEqual(String S){
        String mins, maxs;
        int ans = 8;
        for ( int k = 1; k < S.length(); k++ ){
            if ( S.length()%k != 0 ) continue;
            mins = maxs = S.substring(0, k);
            for ( int s = 0; s < S.length(); s += k ){
                String tmp = S.substring(s, s + k);
                if ( tmp.compareTo(maxs) > 0 ) maxs = tmp;
                if ( tmp.compareTo(mins) < 0 ) mins = tmp;
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    int check12(String S){
        int maxv = 0;
        int minv = 10;
        for( int p = 0; p < S.length(); p++){
            int v = val(S.charAt(p));
            if ( S.charAt(p) == '1' && p+1 < S.length()) {
                v = 10 + val(S.charAt(p+1));
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
        }
        return maxv - minv;
    }

    void solve(){
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }

    public static void main(String[] args){
        new p00369().solve();
    }
}



```

@@ Response
Here is the Python version of the given Java code:

```python
def val(ch):
    return ord(ch) - ord('0')

def sub(maxs, mins):
    for i in range(len(maxs)):
        if maxs[i] != mins[i]:
            if i == len(maxs) - 1:
                return val(maxs[i]) - val(mins[i])
            if i == len(maxs) - 2:
                return (10 * val(maxs[i]) + val(maxs[i + 1])) - (10 * val(mins[i]) + val(mins[i + 1]))
            return 10
    return 0

def checkEqual(S):
    mins, maxs = S[0], S[0]
    ans = 8
    for k in range(1, len(S)):
        if len(S) % k != 0:
            continue
        mins, maxs = S[:k], S[:k]
        for s in range(0, len(S), k):
            tmp = S[s:s + k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check12(S):
    maxv, minv = 0, 10
    for p in range(len(S)):
        v = val(S[p])
        if S[p] == '1' and p + 1 < len(S):
            v = 10 + val(S[p + 1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

def solve():
    S = input()
    print(min(checkEqual(S), check12(S)))

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, and then prints the minimum of the results of the `checkEqual` and `check12` functions.<｜end▁of▁sentence｜>
