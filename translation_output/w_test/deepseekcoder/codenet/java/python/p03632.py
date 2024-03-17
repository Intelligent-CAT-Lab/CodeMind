<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def main():
    try:
        while True:
            inp = input().split(" ")
            a, b, c, d = map(int, inp)
            start = max(a,c)
            end = min(b,d)
            print( (end-start) if (end-start)>0 else 0 )
    except EOFError:
        pass

if __name__ == "__main__":
    main()
```

This Python code reads from the standard input, splits the input line into four integers, calculates the start and end points of the overlap between the intervals, and prints the size of the overlap. If there is no overlap, it prints 0. The code continues to read and process lines until it encounters an end of file (EOFError).
<|EOT|>
