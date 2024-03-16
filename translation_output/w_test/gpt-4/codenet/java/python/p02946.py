Below is the translated Python code from the provided Java snippet:

```python
# Get input as integers
K, X = map(int, input().split())

# Loop through the range and print the numbers
for i in range(X - K + 1, X + K):
    print(i, end=' ')
print()  # For a newline at the end
```

To test this script with the aforementioned test case (input: "3 7"), you can run it in a Python environment and input '3 7' (without the quotes) when prompted for input. The expected output will be '5 6 7 8 9' as stated.
