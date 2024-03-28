Here's the equivalent Python code using Python's built-in input and print functions to handle the input and output. The logic has been translated to Python syntax as well:

```python
A, B, K = map(int, input().split())

if K <= A:
    A -= K
elif K <= A + B:
    B -= K - A
    A = 0
else:
    A = 0
    B = 0

print(A, B)
```

You can run the code with the test input `2 3 3`, and the expected output will be `0 2 44`. However, there seems to be a mistake in the expected output. It should be `0 2` as per the given logic, not `0 2 44`. Here is the corrected expected output for given inputs:

Test input:
```
2 3 3
```

Expected output:
```
0 2
```
