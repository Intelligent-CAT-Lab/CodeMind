<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
    if saface_level != None:
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
[/INST]
```java
public class Main {
    static int[][] g;
    static int cnt = 0;
    static int[] dirs = {-1, 0, 1, 0};
    static int[][] puddles;
    static int volume = 0;
    static int saface_level = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        g = new int[n][2];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                g[i][0] += dirs[s.charAt(j) - '_'] * 2;
            }
        }
        int max = g[0][0];
        for (int i = 1; i < n; i++) {
            if (g[i - 1][0] < g[i][0] && g[i][0] <= max) {
                g[i][1] = true;
            }
            max = Math.max(max, g[i][0]);
        }
        puddles = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (saface_level != 0) {
                volume += saface_level - g[i][0];
                if (saface_level == g[i][0]) {
                    puddles[i] = volume;
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (saface_level == 0 && g[i][1]) {
                saface_level = g[i][0];
            }
        }
        Arrays.sort(puddles);
        System.out.println(Arrays.stream(puddles).sum());
        System.out.println(puddles.length + " " + Arrays.toString(puddles));
    }
}
```</s>
