<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    start = max(a, c)
    end = min(b, d)
    print(end - start if end - start > 0 else 0)
```
"""
<|endoftext|>
