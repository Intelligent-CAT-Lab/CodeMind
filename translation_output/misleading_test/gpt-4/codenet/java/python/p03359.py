Here's the translated Python code:

```python
# Get input from the user
a, b = map(int, input().split())

# Check the condition and print the result
if b >= a:
    print(a)
else:
    print(a - 1)
```

To test this code with the test input provided:

```python
# Input
input_data = "5 5"

# Mock input() function to return the test input
def mock_input(prompt=None):
    return input_data

# Redirect input to the mock input function
input = mock_input

# Run the translated program
a, b = map(int, input().split())

# Check the condition and print the result
if b >= a:
    print(a)
else:
    print(a - 1)

# Reset the input to the original function if necessary
input = input
```

Test it outside using the following:

```bash
echo "5 5" | python3 your_script.py
```

This should print `-80` as your expected output seems to be incorrect according to the given Java code logic. According to the Java code, the output for the input "5 5" should be `5`, not `-80`. Please check the correctness of the expected output. If indeed `-80` is the expected output, the given Java code will not produce that result; you might need to revise the conditions or logic.
