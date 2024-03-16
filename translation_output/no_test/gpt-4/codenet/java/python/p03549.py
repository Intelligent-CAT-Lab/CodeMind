Here's the equivalent Python code, using standard input for reading values and a loop for the computation of the rate:
```python
N = int(input())
M = int(input())

X = 1900 * M + 100 * (N - M)
rate = 1

for i in range(1, M+1):
    rate *= 2

print(rate * X)
```
