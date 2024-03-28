<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 75 25 100

Expected output:
50


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

def overlap(a, b, c, d):
    start = max(a, c)
    end = min(b, d)
    return max(end - start, 0)

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    print(overlap(a, b, c, d))
```

This Python code does the same thing as the Java code. It reads lines from the standard input, splits them into integers, and then calls the `overlap` function to calculate the overlap between the intervals defined by the integers. The `overlap` function calculates the maximum of the difference between the end and start of the intervals and 0, which ensures that the overlap is non-negative. The result is then printed to the standard output.<｜end▁of▁sentence｜>
