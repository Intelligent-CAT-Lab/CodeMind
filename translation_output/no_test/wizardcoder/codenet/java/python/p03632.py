Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import math

def main():
    with sys.stdin as f:
        for line in f:
            a, b, c, d = map(int, line.split())
            start = max(a, c)
            end = min(b, d)
            print(end - start if end - start > 0 else 0)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the necessary modules `sys` and `math`.
- We define a function `main()` that reads input from standard input using a `with` statement.
- We use the `map()` function to convert each line of input into a tuple of four integers.
- We use the `max()` and `min()` functions to find the start and end points of the rectangle.
- We calculate the difference between the end and start points and print the result if it is positive, otherwise we print 0.
- Finally, we call the `main()` function.<|endoftext|>
