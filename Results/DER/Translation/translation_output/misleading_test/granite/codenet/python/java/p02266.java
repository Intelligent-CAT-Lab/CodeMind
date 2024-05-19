System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
\\//

Expected output:
-95
14

```
def func(c):
    global cnt
    cnt += {'_':0, '/':1, '\\':-1}[c]
    return cnt

cnt = 0
g = [[0, False]] + [[func(c), False] for c in input()]

gmax = g[0][0]
for i in range(1, len(g)):
    if g[i - 1][0] < g[i][0] <= gmax :
        g[i][1] = True
    gmax = max(gmax, g[i][0])

puddles = []
volume = 0
saface_level = None

for i in range(len(g) - 1, -1, -1):
    if saface_level!= None:
        volume += saface_level  - g[i][0]
        if saface_level == g[i][0]:
            puddles += [volume]
            saface_level = None
            volume = 0
    if saface_level == None and g[i][1]:
        saface_level = g[i][0] 

puddles = puddles[::-1]
print(sum(puddles))
print(len(puddles), *puddles)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        int[][] g = new int[s.length() + 1][2];
        g[0][0] = 0;
        g[0][1] = false;
        for (int i = 1; i <= s.length(); i++) {
            char c = s.charAt(i - 1);
            if (c == '_') {
                cnt += 0;
            } else if (c == '/') {
                cnt += 1;
            } else if (c == '\\') {
                cnt -= 1;
            }
            g[i][0] = cnt;
            g[i][1] = false;
        }
        int gmax = g[0][0];
        for (int i = 1; i <= s.length(); i++) {
            if (g[i - 1][0] < g[i][0] && g[i][0] <= gmax) {
                g[i][1] = true;
            }
            gmax = Math.max(gmax, g[i][0]);
        }
        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        int safaceLevel = 0;
        for (int i = s.length(); i >= 0; i--) {
            if (safaceLevel!= 0) {
                volume += safaceLevel - g[i][0];
                if (safaceLevel == g[i][0]) {
                    puddles.add(volume);
                    safaceLevel = 0;
                    volume = 0;
                }
            }
            if (safaceLevel == 0 && g[i][1]) {
                safaceLevel = g[i][0];
            }
        }
        Collections.reverse(puddles);
        int sum = 0;
        for (int i : puddles) {
            sum += i;
        }
        System.out.println(sum);
        System.out.print(puddles.size());
        for (int i : puddles) {
            System.out.print(" " + i);
        }
    }
}
```<|endoftext|>
