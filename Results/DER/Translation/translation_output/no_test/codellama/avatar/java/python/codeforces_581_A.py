<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())
count = 0
while a > 0 and b > 0:
    count += 1
    a -= 1
    b -= 1
ans = a // 2 + b // 2
print(count, ans)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `//` operator is used for integer division. The `while` loop is used to count the number of times the loop is executed, and the `print` function is used to print the output.</s>
