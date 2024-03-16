Here's the equivalent Python code for the given Java code:

```python
# Read the input string
s = input()

# Initialize the counter
counter = 0

# Iterate through the string to count changes in adjacent characters
for i in range(len(s)-1):
    if s[i] != s[i+1]:
        counter += 1

# Output the result
print(counter)
```

To test the provided input "BBBWW" with the expected output "1", you can run the following:

```python
# Test input
test_input = "BBBWW"

# Test function (embedded in script)
def test_challenge(input_string):
    counter = 0
    for i in range(len(input_string)-1):
        if input_string[i] != input_string[i+1]:
            counter += 1
    return counter

# Run test
result = test_challenge(test_input)
print(f"Test result: {result}")  # Should print: Test result: 1
```

The Python version uses a for loop with range to iterate over indices of the string, directly comparing the adjacent characters, thus obviating the need for an intermediate list of string characters as used in the Java version.
