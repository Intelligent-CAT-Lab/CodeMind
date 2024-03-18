Below is the translated code from Java to Python:

```python
# Read input from the user
S = input()

min_diff = float('inf')  # Initialized to infinity
for i in range(len(S) - 2):
    X = int(S[i:i+3])  # Extracts a substring and converts it to an integer
    min_diff = min(min_diff, abs(X - 753))  # Computes the minimum difference

print(min_diff)  # Prints the result
```

You can test the code with the provided test input by running the Python code and entering `1234567876` when prompted for the input. The expected output should be `110`.
