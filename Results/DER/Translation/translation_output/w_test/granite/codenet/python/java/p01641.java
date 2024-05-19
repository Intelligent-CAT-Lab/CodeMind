System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class BrainfuckTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int[] memory = new int[30];
        StringBuilder brainfuck = new StringBuilder();

        brainfuck.append(String.join("", Collections.nCopies(30, "+")));
        brainfuck.append(String.join("", Collections.nCopies(30, ">")));
        brainfuck.append(String.join("", Collections.nCopies(10, "<")));

        int point = 0;
        for (char c : input.toCharArray()) {
            int value = (int) c;
            int n = value / 10 - 3;
            int distance = Math.abs(point - n);
            if (point < n) {
                brainfuck.append(String.join("", Collections.nCopies(distance, ">")));
            } else {
                brainfuck.append(String.join("", Collections.nCopies(distance, "<")));
            }
            point = n;

            int diff = Math.abs(memory[point] - value);
            if (memory[point] < value) {
                brainfuck.append(String.join("", Collections.nCopies(diff, "+")));
            } else {
                brainfuck.append(String.join("", Collections.nCopies(diff, "-")));
            }
            memory[point] = value;

            brainfuck.append(".");
        }

        System.out.println(brainfuck.toString());
    }
}
```<|endoftext|>
