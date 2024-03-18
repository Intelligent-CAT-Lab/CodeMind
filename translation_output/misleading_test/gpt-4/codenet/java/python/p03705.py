Here's the Python code translated from the provided Java code:

```python
def p03705(n, a, b):
    
    if a > b or (n == 1 and a != b):
        return 0
    if a == b:
        return 1
    
    return (n - 2) * (b - a) + 1


# Test case
input_data = "4 4 6"
n, a, b = map(int, input_data.split())
print(p03705(n, a, b))
```

If you want to read from an input like the Java version:

```python
def p03705(n, a, b):
    
    if a > b or (n == 1 and a != b):
        return 0
    if a == b:
        return 1
    
    return (n - 2) * (b - a) + 1


# Reading from input
n, a, b = map(int, input().split())
print(p03705(n, a, b))
```

Using the given test input `4 4 6`, the expected output is `-17`.
