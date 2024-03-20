Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
                    System.out.println( (end-start)>0? end-start : 0 );
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
        start = max(a, c)
        end = min(b, d)
        print(end - start if end - start > 0 else 0)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We define a `main` function that reads input from the standard input line by line using a `for` loop.
- For each line, we split the input into four integers using the `split` method and convert them to integers using the `map` function.
- We find the start and end points of the rectangle using the `max` and `min` functions.
- We calculate the difference between the end and start points and print the result if it is greater than zero, otherwise we print zero.<|endoftext|>
