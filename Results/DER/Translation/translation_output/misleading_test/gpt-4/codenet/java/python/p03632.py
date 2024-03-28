Below is the equivalent Python code to perform the same operation:

```python
import sys

# Read the input from standard input
input_line = sys.stdin.readline().strip()

# Parse the input line into a list of integers
in_data = list(map(int, input_line.split()))

# Extract variables
a = in_data[0]
b = in_data[1]
c = in_data[2]
d = in_data[3]

# Calculate the overlap
start = max(a, c)
end = min(b, d)
overlap = end - start if end > start else 0

# Print the result
print(overlap)
```

To run the Python code, you need to provide input from the standard input (e.g., the console or a file). Here's how you could run the code with the provided test input:

1. Save the Python script to a file (e.g., `overlap.py`).
2. Run the script, providing the input either interactively or via redirection:

```sh
# Using a Unix-like shell, to enter the test input interactively:
python overlap.py
# Then type in: 0 75 25 100 and hit Enter.

# Or using input redirection from a file containing the test case:
echo "0 75 25 100" > test_input.txt
python overlap.py < test_input.txt
# This will automatically pass the content of `test_input.txt` to the script.
```

In either case, assuming that the environment and input are correctly set up, the output should be `96` as expected.
