<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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




Translate the above java code to python.

python code:

[/INST]
```python
import math

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

def check_equal(S):
    mins, maxs = S[0], S[0]
    ans = 8
    for k in range(1, len(S)):
        if len(S) % k != 0:
            continue
        mins, maxs = S[0], S[0]
        for s in range(0, len(S), k):
            tmp = S[s:s + k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check_12(S):
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
    print(min(check_equal(S), check_12(S)))

if __name__ == '__main__':
    solve()
```
This is the Python translation of the Java code. The `val` function is the same as the Java code, and the `sub` function is also the same. The `check_equal` function is also the same, but the `check_12` function is different. In Python, we can use the `ord` function to get the ASCII value of a character, and we can use the `range` function to iterate over a string. The `min` and `max` functions are used to find the minimum and maximum values in a list, respectively. The `input` function is used to read a string from the user. The `print` function is used to print the result.</s>
