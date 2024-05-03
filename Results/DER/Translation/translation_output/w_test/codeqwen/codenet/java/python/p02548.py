Here is the Python equivalent of the Java code:

```python
import sys

n = int(sys.stdin.readline())
cnt = 0
for i in range(1, n+1):
    for j in range(1, n+1):
        if i * j < n:
            cnt += 1
        else:
            break
print(cnt)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then it iterates over all pairs of integers from 1 to n, and for each pair, it checks if their product is less than n. If it is, it increments the counter. If the product is not less than n, it breaks the inner loop and moves on to the next pair. Finally, it prints the counter.
