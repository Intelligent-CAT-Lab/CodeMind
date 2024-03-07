<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, c = sys.stdin.readline().split()

if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")
```
Note: The `sys.stdin.readline()` method reads a line from the standard input and returns it as a string. The `split()` method splits the string into a list of substrings, using whitespace as the delimiter. The `a[-1]`, `b[0]`, and `c[0]` expressions access the last character of `a`, the first character of `b`, and the first character of `c`, respectively.</s>
