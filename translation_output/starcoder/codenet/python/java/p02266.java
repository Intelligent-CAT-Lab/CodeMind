<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n + 1];
        g[0] = 0;
        for (int i = 1; i <= n; i++) {
            g[i] = g[i - 1] + (sc.next().equals("_")? 0 : (sc.next().equals("/")? 1 : -1));
        }
        int[] puddles = new int[n];
        int volume = 0;
        int saface_level = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (saface_level!= 0) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles[n - i - 1] = volume;
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (saface_level == 0 && g[i] > 0) {
                saface_level = g[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += puddles[i];
        }
        System.out.println(sum);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(puddles[i] + " ");
        }
    }
}
```
<|endoftext|>
