Here's the translation of the given Java code to Python:

```python
import sys
from collections import defaultdict

def main():
    inputs = list(map(int, input().split()))
    n, x, y = inputs[0], inputs[1]-1, inputs[2]-1
    edges = defaultdict(int)
    
    for i in range(n):
        for j in range(i+1, n):
            edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
            edges[edge] += 1
            
    for i in range(1, n):
        print(edges[i])

if __name__ == "__main__":
    main()
```

- The `Scanner` class from Java is substituted by direct input parsing in Python using `input().split()` to get the space-separated inputs.
- Instead of using an array to count edges, a `defaultdict` from the `collections` module is used to mimic the counting functionality.
- The `print` function is used for output instead of a `PrintWriter`.
- The `main` function is the standard entry point for the script, which is a common practice in Python scripts.
