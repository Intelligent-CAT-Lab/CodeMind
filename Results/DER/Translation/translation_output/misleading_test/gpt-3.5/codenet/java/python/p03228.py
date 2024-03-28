```python
# Enclosed solution in python

def calculate_output(a, b, op):
    for i in range(op):
        if i % 2 == 0:
            b += a // 2
            a //= 2
        else:
            a += b // 2
            b //= 2
    return a

a, b, op = map(int, input().split())
output = calculate_output(a, b, op)
print(output)
```
Test the code with the given sample test case to verify that it produces the expected output.
