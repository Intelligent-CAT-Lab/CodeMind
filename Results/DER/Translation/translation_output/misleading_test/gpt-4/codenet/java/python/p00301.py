Here's the Java code translated into Python. I have maintained the functionality and logic as in the original Java code:

```python
# Test input
n = int(input())

# Initialize variables
a = [0] * 15
i = 0

# Conversion process
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

# Output
result = ""
while i > 0:
    i -= 1
    if a[i] == 0:
        result += "0"
    elif a[i] > 0:
        result += "+"
    else:
        result += "-"
print(result)
```

You can run a test case to verify the output. For the provided test input 25, the expected output is "+0-+".
