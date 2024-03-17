<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
3 2
4 2
4 3
5 2
5 3
5 4

```
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
```
[/INST]
```python
import sys

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    res = []
    for i in range(a, x+1):
        for j in range(b, y+1):
            if i <= j:
                continue
            res.append(f"{i} {j}")
    print(len(res))
    for r in res:
        print(r)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The code uses the `sys` module to read input from stdin and write output to stdout. The `map` function is used to convert the input string to a list of integers. The `range` function is used to iterate over the range of values from `a` to `x` and from `b` to `y`. The `continue` statement is used to skip the current iteration if the condition `i <= j` is true. The `res` list is used to store the results, and the `len` function is used to get the length of the list. Finally, the results are printed to stdout using the `print` function.</s>
