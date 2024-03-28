Here's the Java code translated into Python:

```python
def check_sequence(a, b, c):
    result = "No"
    if a <= c <= b:
        result = "Yes"
    return result

# Sample Test Case
input_sequence = input().strip().split()
a, b, c = map(int, input_sequence)
print(check_sequence(a, b, c))
```

This Python code follows a simple function-based approach to replicate the behavior of the Java code you provided. The `check_sequence` function checks if `c` is between `a` and `b` and returns the corresponding result. 

Here's how the provided test case would work with this code:

Test input:
```
1 3 2
```

Expected output:
```
Yes
```
