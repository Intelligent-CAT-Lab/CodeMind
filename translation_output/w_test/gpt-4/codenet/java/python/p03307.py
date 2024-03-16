Here's the equivalent Python code for the Java code provided:

```python
def problem102a(n):
    return n if n % 2 == 0 else n * 2

# Sample test case
# Since input() is the equivalent of BufferedReader and readLine() in Java,
# and input in Python takes from standard input, we would normally use input().
# However, since this is an example,
# let's assume the "3" is given as test input programmatically.
test_input = 3
print(problem102a(test_input))
```

To run this code with an actual test case, you could replace the `test_input = 3` with `test_input = int(input())`, which would then read an integer from the standard input.
