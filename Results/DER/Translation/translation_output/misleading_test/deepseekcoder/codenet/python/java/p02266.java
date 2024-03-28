<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int[] g = new int[input.length() + 1];
        int cnt = 0;
        for (int i = 1; i < g.length; i++) {
            cnt += switch (input.charAt(i - 1)) {
                case '_' -> 0;
                case '/' -> 1;
                case '\\' -> -1;
                default -> 0;
            };
            g[i] = cnt;
        }

        int gmax = g[0];
        boolean[] mark = new boolean[g.length];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1] < g[i] && g[i] <= gmax) {
                mark[i] = true;
            }
            gmax = Math.max(gmax, g[i]);
        }

        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer saface_level = null;

        for (int i = g.length - 1; i >= 0; i--) {
            if (saface_level != null) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles.add(volume);
                    saface_level = null;
                    volume = 0;
                }
            }
            if (saface_level == null && mark[i]) {
                saface_level = g[i];
            }
        }

        int sum = 0;
        for (int puddle : puddles) {
            sum += puddle;
        }
        System.out.println(sum);
        System.out.println(puddles.size() + " " + String.join(" ", puddles.toString().split("\\[|\\]|,")));
    }
}
```

This Java code does the same thing as your Python code. It reads a string of characters from the standard input, processes it, and then prints the sum of the volumes of the puddles and the number and sizes of the puddles.
<|EOT|>
