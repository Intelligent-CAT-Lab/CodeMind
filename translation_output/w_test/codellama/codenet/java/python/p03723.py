<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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

Here is the Python code that translates the Java code:
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    count = 0
    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:
        if A == B and B == C:
            print(-1)
            return
        a, b, c = A, B, C
        A = (b + c) // 2
        B = (a + c) // 2
        C = (a + b) // 2
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from stdin and write output to stdout, and the `//` operator for integer division. The `map` function is used to convert the input strings to integers.</s>
