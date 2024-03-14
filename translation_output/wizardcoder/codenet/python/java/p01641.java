Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) {
            memory[i] = 30 + i * 10;
        }

        String r = "";
        for (int i = 0; i < 10; i++) {
            r += "+".repeat(i) + ">";
        }
        r += "<".repeat(10);

        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (int) c - 48;
            int d = Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;

            int l = Math.abs(memory[point] - (int) c);
            if (memory[point] < (int) c) {
                r += "+".repeat(l);
            } else {
                r += "-".repeat(l);
            }
            memory[point] = (int) c;

            r += ".";
        }

        System.out.println(r);
    }
}
```<|endoftext|>
