<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
        
        if (x1 == x2) {
            int dif = Math.abs(y1 - y2);
            pw.println((x1 + dif) + " " + y1 + " " + (x1 + dif) + " " + y2);
        } else if (y1 == y2) {
            int dif = Math.abs(x1 - x2);
            pw.println((x1) + " " + (y1 + dif) + " " + (x2) + " " + (y2 + dif));
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            pw.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else {
            pw.println(-1);
        }
        
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
    
    x1, y1, x2, y2 = map(int, in.readline().split())
    
    if x1 == x2:
        dif = abs(y1 - y2)
        pw.write(str(x1 + dif) + " " + str(y1) + " " + str(x1 + dif) + " " + str(y2) + "\n")
    elif y1 == y2:
        dif = abs(x1 - x2)
        pw.write(str(x1) + " " + str(y1 + dif) + " " + str(x2) + " " + str(y2 + dif) + "\n")
    elif abs(x1 - x2) == abs(y1 - y2):
        pw.write(str(x1) + " " + str(y2) + " " + str(x2) + " " + str(y1) + "\n")
    else:
        pw.write("-1\n")
    
    pw.flush()

if __name__ == "__main__":
    main()
```</s>
