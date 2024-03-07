<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.io.*;
import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        ArrayList<String> res = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i <= j) continue;
                res.add(i + " " + j);
            }
        }
        pw.println(res.size());
        for (String str : res) pw.println(str);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys
import math

x, y, a, b = map(int, sys.stdin.readline().split())

res = []
for i in range(a, x+1):
    for j in range(b, y+1):
        if i <= j:
            continue
        res.append(str(i) + " " + str(j))

print(len(res))
for r in res:
    print(r)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `range` function is used to iterate over the range of values. The `str` function is used to convert the integer values to strings. The `len` function is used to get the length of the list, and the `print` function is used to print the output.</s>
