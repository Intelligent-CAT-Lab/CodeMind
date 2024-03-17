

```python
import math

def combination(n, r):
    return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))

n, k = map(int, input().split())
print(combination(k, n))
```

## 02336

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
10


```
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class p02336 implements Runnable {
    
    public static void main(String[] args
