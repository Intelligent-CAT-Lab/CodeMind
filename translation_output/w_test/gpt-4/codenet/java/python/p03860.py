Here's the translated Python code with the equivalent functionality:

```python
# Read the input from the user
line = input().split(" ")
# Get the first character of the second word in upper case
upper = line[1][0]
# Output "A", the uppercase letter, and "C"
print("A" + upper + "C")
```

You can test this Python code with the given input like this:

```python
# Sample test case
test_input = "AtCoder Beginner Contest"
print("Test input:")
print(test_input)

# Simulating input() in the Python code
def input():
    return test_input

# The Python code to be tested
line = input().split(" ")
upper = line[1][0]
print("Expected output:")
print("A" + upper + "C")
```

When you run the Python code with this test case, it should print the expected output `ABC`.
