<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math

s = raw_input()

memory = [i for i in range(30, 121, 10)]
r = ''
r += ''.join(['+'*i+'>' for i in range(30, 121, 10)])
r += '<' * 10

point = 0
for c in s:
    c = ord(c)
    n = c / 10 - 3
    d = int(math.fabs(point - n))
    if point < n:
        r += '>' * d
    else:
        r += '<' * d
    point = n

    l = int(math.fabs(memory[point] - c))
    if memory[point] < c:
        r += '+' * l
    else:
        r += '-' * l
    memory[point] = c

    r += '.'

print r
```

@@ Response
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        List<Integer> memory = new ArrayList<>();
        for (int i = 30; i <= 120; i += 10) {
            memory.add(i);
        }

        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) {
            r.append("+".repeat(i)).append(">");
        }
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int n = (int) c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;

            int l = Math.abs(memory.get(point) - c);
            if (memory.get(point) < c) {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory.set(point, c);

            r.append(".");
        }

        System.out.println(r);
    }
}
```

Please note that Java does not have a built-in repeat method for strings, so I used the ```String.repeat(int)``` method to achieve the same effect. Also, Java does not have a raw_input() function, so I used ```Scanner.nextLine()``` to get the input.<｜end▁of▁sentence｜>
