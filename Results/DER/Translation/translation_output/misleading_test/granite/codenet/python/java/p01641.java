System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class BrainfuckTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int[] memory = new int[30];
        String output = "";

        for (char c : input.toCharArray()) {
            int value = (int) c;
            int n = value / 10 - 3;
            int d = Math.abs(n - memory[0]);
            if (n > memory[0]) {
                output += String.join("", Collections.nCopies(d, ">"));
            } else {
                output += String.join("", Collections.nCopies(d, "<"));
            }
            memory[0] = n;

            int l = Math.abs(value - memory[n]);
            if (value > memory[n]) {
                output += String.join("", Collections.nCopies(l, "+"));
            } else {
                output += String.join("", Collections.nCopies(l, "-"));
            }
            memory[n] = value;

            output += ".";
        }

        System.out.println(output);
    }
}
```<|endoftext|>
