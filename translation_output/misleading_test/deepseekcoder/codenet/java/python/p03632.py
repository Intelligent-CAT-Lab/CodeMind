<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    for line in sys.stdin:
        a, b, c, d = map(int, line.split())
        start = max(a,c)
        end = min(b,d)
        print(max(0, end-start))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads from the standard input, splits the input into four integers, calculates the start and end points of the overlap, and then prints the size of the overlap. If there is no overlap, it prints 0.
<|EOT|>
