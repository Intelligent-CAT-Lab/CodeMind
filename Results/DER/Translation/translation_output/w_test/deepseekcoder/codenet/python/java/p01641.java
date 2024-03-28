<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
++++++++[>++++++++<-]>+.+.+.


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
Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) memory[i] = 30 + i * 10;
        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) r.append(">".repeat(i));
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int c_val = (int) c;
            int n = c_val / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) r.append(">".repeat(d));
            else r.append("<".repeat(d));
            point = n;

            int l = Math.abs(memory[point] - c_val);
            if (memory[point] < c_val) r.append("+".repeat(l));
            else r.append("-".repeat(l));
            memory[point] = c_val;

            r.append(".");
        }

        System.out.println(r);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the input, then it translates each character of the string into Brainfuck language. The Brainfuck language is a minimalist programming language created in 1993 by Urban M�ller. The language consists of only eight simple commands, a data pointer and an instruction pointer. While it is fully Turing-complete, it is not intended for practical use, but to challenge and amuse programmers.
<|EOT|>
