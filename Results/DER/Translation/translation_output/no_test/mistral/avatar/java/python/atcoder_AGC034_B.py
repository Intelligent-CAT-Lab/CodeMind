<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BABC solver = new BABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class BABC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next().replaceAll("BC", "D");
            long cnt = 0;
            long tmp = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    tmp++;
                } else if (s.charAt(i) == 'D') {
                    cnt += tmp;
                } else {
                    tmp = 0;
                }
            }
            out.println(cnt);
        }
    }
}
```
[/INST]
```python
import sys

def solve(test_number, in, out):
    s = in.readline().replace("BC", "D")
    cnt = 0
    tmp = 0
    for i in range(len(s)):
        if s[i] == 'A':
            tmp += 1
        elif s[i] == 'D':
            cnt += tmp
        else:
            tmp = 0
    out.write(str(cnt) + "\n")

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solver = BABC()
    solver.solve(1, in, out)
```</s>
