Here is the Python equivalent of the Java code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    cnt = 0
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i * j < n:
                cnt += 1
            else:
                break
    print(cnt)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then iterates over all pairs of integers from 1 to n, incrementing a counter if the product of the pair is less than n. Finally, it prints the counter.
