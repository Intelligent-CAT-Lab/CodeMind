<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
4


```
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class p03644 {
    public static PrintWriter out;

    public static void main(String[] args) {
        p03644.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        out.println(count(Integer.parseInt(sc.next())));
        out.close();
        sc.close();
    }

    private static int count(int pnum) {
        int result = 0;
        for (int i = 0; (int) Math.pow(2, i) <= pnum; i++) {
            result = (int) Math.pow(2, i);
        }
        return result;
    }
}

```
[/INST]
```python
import sys

def count(pnum):
    result = 0
    for i in range(1, pnum+1):
        result |= 1 << i
    return result

if __name__ == "__main__":
    out = sys.stdout
    sc = sys.stdin
    out.write(str(count(int(sc.readline().strip()))))
    out.flush()
    sc.close()
```</s>
