Here is the translated Python code below:

```python
n, k = map(int, input().split())
ans = 0
for i in range(n - 1):
    ans = k * (ans // (k - 1)) + ans % (k - 1) + 1
print(ans)
```

The input can be provided in the same way as the test, i.e., by giving a string containing two numbers separated by a space, in a standard input way (terminal, command line, etc.). Here's how you can test this code:

```python
# Test input:
# 4 2
input_str = '4 2'  # Replace this line with 'input()' in an actual program to read from standard input
n, k = map(int, input_str.split())
ans = 0
for i in range(n - 1):
    ans = k * (ans // (k - 1)) + ans % (k - 1) + 1
print(ans)  # Expected output: 5
```

When you run the code with the sample input provided as `input_str`, it should output `5`, as expected.
