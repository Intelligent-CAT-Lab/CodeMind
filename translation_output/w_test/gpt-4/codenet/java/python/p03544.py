Here's the Java code translated to Python:

```python
def p03544(n):
    num = [0]*100
    for i in range(100):
        if i == 0:
            num[i] = 2
        elif i == 1:
            num[i] = 1
        else:
            num[i] = num[i-1] + num[i-2]
    return num[n]

# Test input
n = int(input())
# Expected output
print(p03544(n))
```

If you input `5` as stated in the test case, the expected output produced from the Python code would be `11`, matching the Java code behavior.
