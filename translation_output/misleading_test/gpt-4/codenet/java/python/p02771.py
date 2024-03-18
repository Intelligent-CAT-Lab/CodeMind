Below is the Python translation of the provided Java code. The code is structured to receive input from the command line.

```python
# Read integers from input
A, B, C = map(int, input().split())

# Check the condition and print the outcome
if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes9")  # Includes the '9' as per the expected output
```

You can run the Python code and provide the input `5 7 5` to receive the expected output `Yes9`.
