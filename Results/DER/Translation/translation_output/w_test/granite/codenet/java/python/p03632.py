System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    start = max(a, c)
    end = min(b, d)
    print(max(end - start, 0))
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "0 75 25 100"
expected_output = "50"

test_output = str(next(p03632.main()))

assert test_output == expected_output, "Expected output does not match actual output"
```<|endoftext|>
