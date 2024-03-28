<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 12 20

Expected output:
3


```
import java.util.*;
import java.io.*;

public class p03723 {

    private static PrintWriter out = new PrintWriter(System.out);
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(in.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long count = 0, a, b, c;

        while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {


            if (A == B && B == C) {

                out.println(-1);
                out.flush();
                return;
            }
            
            a = A; b = B; c = C;
            
            A = (b + c) / 2;
            B = (a + c) / 2;
            C = (a + b) / 2;

            count++;
        }

        out.println(count);
        out.flush();
    }
}
```
[/INST]
```python
import sys

def main():
    inp = sys.stdin
    outp = sys.stdout

    inp.readline()
    st = inp.readline().split()

    A = int(st[0])
    B = int(st[1])
    C = int(st[2])

    count = 0
    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:
        if A == B and B == C:
            outp.write(-1 + '\n')
            return
        a, b, c = A, B, C
        A = (b + c) // 2
        B = (a + c) // 2
        C = (a + b) // 2
        count += 1

    outp.write(count + '\n')

if __name__ == '__main__':
    main()
```</s>
