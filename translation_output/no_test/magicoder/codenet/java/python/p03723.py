<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())

    count = 0

    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:

        if A == B == C:
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then repeatedly divides them by 2 until they are all odd. If at any point they are all equal, it prints -1 and returns. Otherwise, it prints the number of times it divided them by 2.<｜end▁of▁sentence｜>
