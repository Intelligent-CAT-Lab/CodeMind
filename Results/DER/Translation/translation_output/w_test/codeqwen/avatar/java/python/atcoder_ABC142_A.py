Here is the Python equivalent of the Java code:

```python
N = int(input())
sum = 0

for i in range(1, N+1):
    if i % 2 != 0:
        sum += 1

print(sum / N)
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates over all integers from 1 to N (inclusive). If the current integer is odd, it adds 1 to the sum. After the loop, it prints the sum divided by N, which is the average of all odd numbers from 1 to N.
