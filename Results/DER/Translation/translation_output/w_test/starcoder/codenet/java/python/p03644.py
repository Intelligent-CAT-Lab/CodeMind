<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def count(pnum):
    result = 0
    for i in range(0, int(math.log(pnum, 2)) + 1):
        result = 2 ** i
    return result

def main():
    pnum = int(sys.stdin.readline())
    print(count(pnum))

if __name__ == '__main__':
    main()

```
<|endoftext|>
