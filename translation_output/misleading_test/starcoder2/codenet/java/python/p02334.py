

```python
import math

def combination(n, r):
    return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))

n, k = map(int, input().split())
print(combination(n + k - 1, k))
```

## 02335

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
10

```
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class p02335 implements Runnable {
