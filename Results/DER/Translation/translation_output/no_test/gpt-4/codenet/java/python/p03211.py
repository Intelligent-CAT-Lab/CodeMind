Here's the equivalent Python code:

```python
S = input()
min_diff = 1000
for i in range(len(S) - 2):
    X = int(S[i:i+3])
    min_diff = min(min_diff, abs(X - 753))
print(min_diff)
```

In Python, we don't need to import a Scanner as we can use the built-in `input()` function to get the user input from stdin. The rest of the code directly translates to Python's syntax with minor adjustments for the language differences. For instance, string slicing in Python directly takes the place of Java's `substring()` method, and the `abs()` and `min()` functions provide the necessary operations.
