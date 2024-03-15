<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    in = sys.stdin
    pw = sys.stdout
    x, y, a, b = map(int, in.readline().split())
    res = []
    for i in range(a, x+1):
        for j in range(b, y+1):
            if i <= j:
                continue
            res.append(str(i) + " " + str(j))
    pw.write(str(len(res)) + "\n")
    for s in res:
        pw.write(s + "\n")
    pw.close()

if __name__ == "__main__":
    main()
```</s>
