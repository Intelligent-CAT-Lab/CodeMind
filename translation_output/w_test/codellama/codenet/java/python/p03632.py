<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    for line in sys.stdin:
        a, b, c, d = map(int, line.split())
        start = max(a, c)
        end = min(b, d)
        print(max(end - start, 0))

if __name__ == "__main__":
    main()
```
This code reads the input from stdin, splits it into four integers using the `split()` method, and then calculates the difference between the maximum and minimum values of the two pairs of integers. The result is then printed to stdout.

Note that the `map()` function is used to convert the input strings to integers, and the `max()` and `min()` functions are used to calculate the maximum and minimum values of the two pairs of integers. The `print()` function is used to print the result to stdout.</s>
