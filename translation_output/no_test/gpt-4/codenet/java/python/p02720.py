Here's an equivalent Python script using the built-in `deque` data structure. Instead of a custom scanner class, we'll use Python's built-in capabilities to read input.

```python
from collections import deque

def main():
    k = int(input())
    queue = deque([i for i in range(1, 10)])
    val = -1
    
    while k > 0:
        val = queue.popleft()
        if val % 10 != 0:
            queue.append(10 * val + val % 10 - 1)
        queue.append(10 * val + val % 10)
        if val % 10 != 9:
            queue.append(10 * val + val % 10 + 1)
        k -= 1
        
    print(val)

if __name__ == "__main__":
    main()
```

This code assumes that the input will be provided from the standard input (e.g., the command line or a redirected file). This Python script will mimic the main functionality of the original Java code but with the idiomatic Python way of handling I/O and data structures.
