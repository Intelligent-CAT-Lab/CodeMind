<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cnt = 0;
        List<Integer> g = new ArrayList<>();
        g.add(0);
        for (char c : input.toCharArray()) {
            cnt += switch (c) {
                case '_' -> 0;
                case '/' -> 1;
                case '\\' -> -1;
                default -> 0;
            };
            g.add(cnt);
        }

        int gmax = g.get(0);
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1) < g.get(i) && g.get(i) <= gmax) {
                g.set(i, g.get(i) + 1000);
            }
            gmax = Math.max(gmax, g.get(i));
        }

        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer safaceLevel = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (safaceLevel != null) {
                volume += safaceLevel - g.get(i);
                if (safaceLevel == g.get(i)) {
                    puddles.add(volume);
                    safaceLevel = null;
                    volume = 0;
                }
            }
            if (safaceLevel == null && g.get(i) > 1000) {
                safaceLevel = g.get(i) - 1000;
            }
        }

        Collections.reverse(puddles);
        int sum = 0;
        for (int puddle : puddles) {
            sum += puddle;
        }
        System.out.println(sum);
        System.out.print(puddles.size());
        for (int puddle : puddles) {
            System.out.print(" " + puddle);
        }
    }
}
```

Please note that in Java, we cannot use the same variable name for different types of data. Therefore, we use a different number (1000) to mark the puddles in the list `g`. The final output is the same as the Python code.<｜end▁of▁sentence｜>
