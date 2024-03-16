<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
class p00369:
    def val(self, ch):
        return ord(ch)-ord('0')

    def sub(self, maxs, mins):
        for i in range(len(maxs)):
            if maxs[i] != mins[i]:
                if i == len(maxs)-1:
                    return self.val(maxs[i]) - self.val(mins[i])
                if i == len(maxs)-2:
                    return (10*self.val(maxs[i])+self.val(maxs[i+1])) - (10*self.val(mins[i])+self.val(mins[i+1]))
                return 10
        return 0

    def checkEqual(self, S):
        mins, maxs = S[0], S[0]
        ans = 8
        for k in range(1, len(S)):
            if len(S)%k != 0: continue
            mins, maxs = min(mins, S[0:k]), max(maxs, S[0:k])
            for s in range(k, len(S), k):
                tmp = S[s:s+k]
                if tmp > maxs: maxs = tmp
                if tmp < mins: mins = tmp
            ans = min(ans, self.sub(maxs, mins))
        return ans

    def check12(self, S):
        maxv = 0
        minv = 10
        for p in range(len(S)):
            v = self.val(S[p])
            if S[p] == '1' and p+1 < len(S): 
                v = 10 + self.val(S[p+1])
                p+=1
            maxv = max(maxv, v)
            minv = min(minv, v)
        return maxv - minv

    def solve(self):
        S = input()
        print(min(self.checkEqual(S), self.check12(S)))

p00369().solve()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, and then it prints the minimum of two values: the difference between the maximum and minimum values of the string, considering all possible substrings of the string, and the difference between the maximum and minimum values of the string, considering all possible values of the string.
<|EOT|>
