<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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

        int[] memory = new int[10];
        Arrays.fill(memory, 0);
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < memory.length; i++) {
            r.append(memory[i] == 0 ? '>' : '<');
        }

        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = c - '0' - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(d > 0 ? '>' : '<');
            } else {
                r.append(d > 0 ? '>' : '<');
            }
            point = n;

            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r.append(l > 0 ? '+' : '-');
            } else {
                r.append(l > 0 ? '+' : '-');
            }
            memory[point] = c;

            r.append('.');
        }

        System.out.println(r.toString());
    }
}
```</s>
