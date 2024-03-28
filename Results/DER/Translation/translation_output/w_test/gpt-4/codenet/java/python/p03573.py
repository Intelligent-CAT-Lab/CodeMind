Below is the translated Python code:

```python
# Read input from user
A, B, C = map(int, input().split())

# Determine which number is different and print it
if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)
```

When you run this Python script, you can test it with the sample input provided:

Test input:
```
5 7 5
```

Expected output:
```
7
```
