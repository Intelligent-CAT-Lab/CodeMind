<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
public class Main {
    public static int sub(int[] maxs, int[] mins) {
        for (int i = 0; i < maxs.length; i++) {
            if (maxs[i] != mins[i]) {
                if (i == maxs.length - 1) {
                    return maxs[i] - mins[i];
                }
                if (i == maxs.length - 2) {
                    return maxs[i] - mins[i];
                }
                return 10;
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 2; k < S.length(); k++) {
            if (S.length() % k != 0) {
                continue;
            }
            int[] mins = new int[k];
            int[] maxs = new int[k];
            for (int i = 0; i < k; i++) {
                mins[i] = Integer.parseInt(S.substring(i, i + k));
                maxs[i] = Integer.parseInt(S.substring(i, i + k));
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
            int v = Integer.parseInt(S.substring(p, p + 1));
            if (S.charAt(p) == '1' && p + 1 < S.length()) {
                v = 10 + Integer.parseInt(S.substring(p + 1, p + 2));
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p++;
        }
        return maxv - minv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}
```</s>
