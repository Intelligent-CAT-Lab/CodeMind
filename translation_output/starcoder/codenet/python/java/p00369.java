<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def sub(maxs, mins):
    for i in range(len(maxs)):
        if maxs[i]!= mins[i]:
            if i == len(maxs)-1:
                return int(maxs[i]) - int(mins[i])
            if i == len(maxs)-2:
                return int(maxs[i:i+2]) - int(mins[i:i+2])
            return 10
    return 0

def checkEqual(S):
    ans = 8
    for k in range(1, len(S)):
        if len(S)%k!= 0: continue
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 8;
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k!= 0) continue;
            String maxs = S.substring(0, k);
            String mins = S.substring(0, k);
            for (int s = 0; s < S.length(); s += k) {
                maxs = Math.max(maxs, S.substring(s, s + k));
                mins = Math.min(mins, S.substring(s, s + k));
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        System.out.println(ans);
    }

    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i)!= mins.charAt(i)) {
                if (i == maxs.length() - 1) return Integer.parseInt(maxs.substring(i)) - Integer.parseInt(mins.substring(i));
                if (i == maxs.length() - 2) return Integer.parseInt(maxs.substring(i, i + 2)) - Integer.parseInt(mins.substring(i, i + 2));
                return 10;
            }
        }
        return 0;
    }
}
```
<|endoftext|>
