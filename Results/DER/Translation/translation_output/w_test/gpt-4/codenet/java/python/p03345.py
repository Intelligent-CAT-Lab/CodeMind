Below is the equivalent Python code for the provided Java code. The use of Python's built-in functions such as `abs` and `pow` respects the same functionality as `Math.abs` and `Math.pow` in Java. Python's `input().split()` is used to replace the `Scanner` input mechanism from Java.

```python
a, b, c, k = map(int, input().split())
ans = a - b
if abs(ans) > pow(10, 18):
    print("Unfair")
else:
    print(ans if k % 2 == 0 else -ans)
```

You can run this code with the provided test input to get the expected output:

Test input:
`1 2 3 1`

Expected output:
`1`
