<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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
    for r in res:
        print(r)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, then generates all pairs of integers (i, j) such that a <= i <= x and b <= j <= y and i > j, and stores them in a list. Finally, it prints the number of pairs and all pairs.<｜end▁of▁sentence｜>
