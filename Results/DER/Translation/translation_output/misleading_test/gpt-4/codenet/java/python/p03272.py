Here is the corresponding Python code for the given Java code:

```python
def main():
    # Reading space-separated input and turning them into integers
    N, K = map(int, input().split())

    # Printing the result of the computation
    print(N - K + 1)

# Running the function
if __name__ == "__main__":
    main()
```

To test the code with the specified test inputs and obtain the expected output:

```python
# Define a function for test cases
def test(input_data):
    N, K = map(int, input_data.split())
    return N - K + 1

# Test input
test_input = "4 2"

# Expected output: 102
print(test(test_input))
```

When you run this in a Python environment, with the test input provided ("4 2"), it should output `3`, which corresponds to the expected `102` if the input is read and handled correctly. If the expected output `102` is indeed correct, then there seems to be an inconsistency or typo because the mathematical result of `N - K + 1` with `N=4` and `K=2` should be `3`. Please double-check the expected output for correctness.
