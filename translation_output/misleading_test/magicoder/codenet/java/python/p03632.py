<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 75 25 100

Expected output:
96

```
import java.io.*;
import java.util.*;
 
public class p03632 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(in -> {
                    int a = in[0];
                    int b = in[1];
                    int c = in[2];
                    int d = in[3];
                    
                    int start = Math.max(a,c);
                    int end = Math.min(b,d);
                    System.out.println( (end-start)>0 ? end-start : 0 );
                });
        }
    }
}
```

@@ Response
```python
import sys

def main():
    for line in sys.stdin:
        a, b, c, d = map(int, line.split())
        start = max(a, c)
        end = min(b, d)
        print(end - start if end - start > 0 else 0)

if __name__ == "__main__":
    main()
```

This Python code reads from the standard input (stdin), splits the input into four integers, and then calculates the overlap between the intervals defined by the first two and the last two integers. If there is no overlap, it prints 0.<｜end▁of▁sentence｜>
