Here's the equivalent Python code for the provided Java code:

```python
n = int(input())

for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        break
```

This code reads an integer from the standard input, then iterates from that number up to (but not including) 1000, and prints the first number within that range that is divisible by 111.
