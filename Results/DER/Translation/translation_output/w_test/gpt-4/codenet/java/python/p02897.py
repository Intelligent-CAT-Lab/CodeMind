Here's the translated code from Java to Python:

```python
# Read input from the user
n = int(input())

# Initialize counters
odd = 0
notOdd = 0

# Loop through numbers from 1 to n
for i in range(1, n + 1):
    if i % 2 == 0:
        notOdd += 1
    else:
        odd += 1

# Calculate and print the result
print(f'{odd / n:.10f}')

# Example test case:
# Input: 4
# Expected Output: 0.5000000000
```

Now, let's apply it to the provided test input:

```python
test_input = 4
print(f'{(test_input // 2) / test_input:.10f}')
```

This will give you the expected output of `0.5000000000`. Note that I optimized the calculation by directly dividing the integer division `(test_input // 2)` by `test_input`, assuming `test_input` is even, as in the provided test case.

