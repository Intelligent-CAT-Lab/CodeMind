Here is the equivalent Python code for the provided Java code:

```python
# Read input
s = input()

# Initialize array to store the last occurrence of each character
last = [-1] * 26

# Iterate through the characters in the input string
for i, char in enumerate(s):
    ch = ord(char) - ord('a')
    # Check if the character has occurred before with distance less than 3
    if last[ch] >= 0 and i - last[ch] < 3:
        # Output the indices (1-indexed)
        print(last[ch] + 1, i + 1)
        break
    last[ch] = i
else:
    # If no such characters are found
    print("-1 -1")

# Sample Test Case
# Input: "needed"
# Output: "2 5"
```

Please note the following when interpreting the Python code:
- In Python, input is read using the `input()` function.
- String to character array conversion is not needed as strings in Python are iterable.
- Python `enumerate()` function is used for looping over the string while keeping track of the index.
- Python does not have a `printf` function; string formatting is done differently.
- Array initialization uses a list comprehension `[-1] * 26` to create a list of `-1`s.
- The `else` clause associated with the `for` loop executes only when the loop is not terminated by a `break`, which is used here to print `-1 -1` if no valid characters are found within the distance constraint.
