<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03729 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### Response:
```python
import sys

def p03729():
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    c = sys.stdin.readline().strip()

    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

p03729()
```

This Python code does the same thing as the Java code. It reads three strings from the standard input, and checks if the last character of the first string is the same as the first character of the second string, and the last character of the second string is the same as the first character of the third string. If these conditions are met, it prints "YES", otherwise it prints "NO".
<|EOT|>
