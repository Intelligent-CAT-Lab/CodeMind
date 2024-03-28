Here is the Java code translated into Python:

```python
import sys
from collections import defaultdict

def main():
    n, x, y = map(int, input().split())
    x -= 1
    y -= 1
    edges = defaultdict(int)
    for i in range(n):
        for j in range(i + 1, n):
            edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
            edges[edge] += 1
    for i in range(1, n):
        print(edges[i])

if __name__ == "__main__":
    main()
```

Now, let's test it with the provided test case:

Test input:
```
5 2 4
```

Expected output:
```
4
1
0
```

In the Python code, I use a `defaultdict(int)` to handle the edge counting similar to how an array is used in the Java version. This is necessary because the edge lengths may not be sequential, and a `defaultdict` will automatically handle any missing keys by generating a default value of zero for them.

If you want to have exactly the same behavior as the Java code, you'd need to convert `edges` to a list of the same size as the number of vertices (n) before printing, with all elements initialized to zero. Then, increment the counts in that list instead of using a `defaultdict`. However, in this case, since the index range we care about is 1 to n-1, and `edges` never accesses index 0, using a `defaultdict` is a more straightforward solution in Python.
