Here's the Java code translated into Python:

```python
def codeforces_92_A(n, k):
    i = 1
    req = 1
    
    while k - req >= 0:
        k -= req
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n
            
    return k

# Test input
n, k = map(int, input().split())

# Expected output
print(codeforces_92_A(n, k))
```

You can use this Python function to achieve the same result as the Java code. Remember to execute this code in a Python environment to enter the test input and see the expected output.
