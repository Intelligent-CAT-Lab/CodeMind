<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
    static int cnt = 0;
    static List<Integer> g = new ArrayList<>();
    static List<Integer> puddles = new ArrayList<>();
    static Integer saface_level = null;
    static int volume = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        g.add(0);
        for (char c : input.toCharArray()) {
            g.add(func(c));
        }

        int gmax = g.get(0);
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1) < g.get(i) && g.get(i) <= gmax) {
                g.set(i, g.get(i) + 1000);
            }
            gmax = Math.max(gmax, g.get(i));
        }

        for (int i = g.size() - 1; i >= 0; i--) {
            if (saface_level != null) {
                volume += saface_level - g.get(i);
                if (saface_level == g.get(i)) {
                    puddles.add(volume);
                    saface_level = null;
                    volume = 0;
                }
            }
            if (saface_level == null && g.get(i) > 1000) {
                saface_level = g.get(i) - 1000;
            }
        }

        Collections.reverse(puddles);
        int sum = 0;
        for (int puddle : puddles) {
            sum += puddle;
        }
        System.out.println(sum);
        System.out.println(puddles.size());
        for (int puddle : puddles) {
            System.out.print(puddle + " ");
        }
    }

    static int func(char c) {
        cnt += switch (c) {
            case '_' -> 0;
            case '/' -> 1;
            case '\\' -> -1;
            default -> 0;
        };
        return cnt;
    }
}
```

Please note that in Java, we cannot use a dictionary like in Python to map characters to integers. Instead, we use a switch statement. Also, we use a list to simulate the behavior of Python's list. We add 1000 to the value of g[i] when it is a puddle, and subtract 1000 when we need to calculate the volume of the puddle.<｜end▁of▁sentence｜>
