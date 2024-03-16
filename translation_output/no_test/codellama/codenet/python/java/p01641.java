<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[12];
        for (int i = 0; i < 12; i++) {
            memory[i] = i * 10;
        }

        String r = "";
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            int n = (int) Math.floor(c / 10) - 3;
            int d = (int) Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;

            int l = (int) Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r += "+".repeat(l);
            } else {
                r += "-".repeat(l);
            }
            memory[point] = c;

            r += ".";
        }

        System.out.println(r);
    }
}
```
Note that the `repeat` method is used to repeat a string a certain number of times. In Java, you can use the `StringBuilder` class to build a string by appending characters or strings.

Also, note that the `Math.floor` method is used to round a number down to the nearest integer. In Java, you can use the `Math.round` method to round a number to the nearest integer.

I hope this helps! Let me know if you have any questions.</s>
