<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
\\//

Expected output:
4
1 4


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
    static int cnt = 0;
    static int[][] g;
    static int gmax = 0;
    static int[] puddles = new int[1000];
    static int volume = 0;
    static int saface_level = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split("\\s");
        int n = arr.length;
        g = new int[n][2];
        for (int i = 0; i < n; i++) {
            g[i][0] = arr[i].charAt(0) == '/' ? 1 : arr[i].charAt(0) == '\\' ? -1 : 0;
            g[i][1] = false;
        }
        gmax = g[0][0];
        for (int i = 1; i < n; i++) {
            if (g[i - 1][0] < g[i][0] <= gmax) {
                g[i][1] = true;
            }
            gmax = Math.max(gmax, g[i][0]);
        }
        for (int i = n - 1; i >= 0; i--) {
            if (saface_level != 0) {
                volume += saface_level - g[i][0];
                if (saface_level == g[i][0]) {
                    puddles[cnt++] = volume;
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (g[i][1] && saface_level == 0) {
                saface_level = g[i][0];
            }
        }
        Arrays.sort(puddles);
        System.out.println(Arrays.stream(puddles).sum());
        System.out.println(cnt, puddles[0]);
    }
}
```</s>
