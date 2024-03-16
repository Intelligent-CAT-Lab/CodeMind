<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.io.*;
import java.util.*;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0) {
            if (m != 0)
                System.out.println("Impossible");
            else
                System.out.println(0 + " " + 0);
            return;
        }

        if (m <= n) {
            if (m == 0) {
                m = 1;
            }
            System.out.print(n + " " + (m + n - 1));
            return;
        }

        System.out.print(m + " " + (m + n - 1));
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

n, m = map(int, input().split())

if n == 0:
    if m != 0:
        print("Impossible")
    else:
        print(0, 0)
    sys.exit()

if m <= n:
    if m == 0:
        m = 1
    print(n, m + n - 1)
else:
    print(m, m + n - 1)
```
Note: The `sys.exit()` function is used to exit the program after printing the output.</s>
