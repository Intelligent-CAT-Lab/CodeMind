Here's the Java code translated to Python:

```python
S = input()
min_value = 1000

for i in range(len(S) - 2):
    X = int(S[i:i + 3])
    min_value = min(min_value, abs(X - 753))

print(min_value)
```

And for the sample test case:

Test input:
```
1234567876
```

Expected output:
```
34
```
