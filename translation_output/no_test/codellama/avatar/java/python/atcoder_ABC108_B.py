<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2 + (y1 - y2);
        int y3 = y2 - (x1 - x2);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)
print(x3, y3, x4, y4)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `split` method is used to split the input string into four integers. The rest of the code is similar to the Java code, with the only difference being that Python uses parentheses instead of curly braces to denote code blocks.</s>
