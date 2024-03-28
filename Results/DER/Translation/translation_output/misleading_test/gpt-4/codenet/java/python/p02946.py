Here is the equivalent Python code:

```python
# Reading input
K, X = map(int, input().split())

# Outputting the range of numbers
for i in range(X - K + 1, X + K):
    print(i, end=' ')
print()  # For the newline at the end
```

You can run a sample test case as follows in Python:

```python
# Sample test input:
# 3 7

# Sample test code:
K, X = 3, 7

for i in range(X - K + 1, X + K):
    print(i, end=' ')
print()  # Expected output: 5 6 7 8
```
