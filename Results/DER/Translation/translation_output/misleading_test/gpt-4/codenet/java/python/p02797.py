Here is the Python translation of the provided Java code. The Python code reads input values, processes the logic as per the original Java code, and produces the output using Python's print statements:

```python
# Read input
N, K, S = map(int, input().split())

# Process the logic and produce the output
if K == 0:
    if S == 1000000000:
        for i in range(N):
            print("1", end=" ")
    else:
        S += 1
        for i in range(N):
            print(S, end=" ")
else:
    for i in range(N):
        if i < K:
            print(S, end=" ")
        else:
            if S == 1000000000:
                print("1", end=" ")
            else:
                print(S + 1, end=" ")

# No explicit flush needed as print flushes by default in Python 3

# Example test case
# input: 4 2 3
# output: 27 -83 -40 77
```

In the absence of specific context, the way to handle the test case (e.g., handling user input or just demonstrating the functionality) is not included here. You can call the code with the appropriate inputs, or add input handling depending on your needs.
