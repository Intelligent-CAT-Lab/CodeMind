<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();

        List<Integer> memory = new ArrayList<>();
        for (int i = 30; i <= 120; i += 10) {
            memory.add(i);
        }

        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) {
            r.append("+".repeat(i));
            r.append(">");
        }
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int cInt = (int) c;
            int n = cInt / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;

            int l = Math.abs(memory.get(point) - cInt);
            if (memory.get(point) < cInt) {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory.set(point, cInt);

            r.append(".");
        }

        System.out.println(r);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then processes each character in the string to generate a string of commands for a hypothetical machine. The commands are added to a StringBuilder, which is then printed out. The machine's state is stored in a list of integers.
<|EOT|>
