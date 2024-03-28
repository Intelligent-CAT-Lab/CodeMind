<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    res = []
    for i in range(a, x + 1):
        for j in range(b, y + 1):
            if i <= j: continue
            res.append(str(i) + " " + str(j))
    print(len(res))
    for string in res: print(string)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, generates all pairs of integers `(i, j)` where `a <= i <= x` and `b <= j <= y` and `i` is not equal to `j`, and then prints the number of such pairs and the pairs themselves.
<|EOT|>
