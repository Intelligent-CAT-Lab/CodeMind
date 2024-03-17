Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
                    System.out.println( (end-start)>0? end-start : 0 );
                });
        }
    }
}
```

### Response:
```python
import sys

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    start = max(a, c)
    end = min(b, d)
    print(end - start if end - start > 0 else 0)
```

Explanation:

- We use the `sys` module to read input from standard input.
- We use the `map` function to convert the input string to integers.
- We use the `max` and `min` functions to find the start and end points of the rectangle.
- We use the ternary operator to check if the difference between the end and start points is greater than zero. If it is, we print the difference. Otherwise, we print 0.<|endoftext|>
