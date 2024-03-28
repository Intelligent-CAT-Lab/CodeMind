<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
I+++++++[>++++{t++<C]>T.+.+.

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
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] memory = new int[121];
        Arrays.fill(memory, 0);
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            r.append("+".repeat(i + 1)).append(">");
        }
        r.append("<".repeat(10));
        int point = 0;
        for (char c : s.toCharArray()) {
            int n = c - 'A' / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;
            int l = Math.abs(memory[point] - c - 'A');
            if (memory[point] < c - 'A') {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory[point] = c - 'A';
            r.append(".");
        }
        System.out.println(r.toString());
    }
}
```</s>
