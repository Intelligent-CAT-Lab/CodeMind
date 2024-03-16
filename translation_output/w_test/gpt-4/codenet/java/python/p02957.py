Below is the Python translation of the provided Java code. It reads two numbers from standard input, adds them together, and prints their average if their sum is even, otherwise it prints "IMPOSSIBLE":

```python
# Since the given Java code is using BufferedReader and Scanner for input,
# we will use input() in Python to read from standard input
# Note: This solution assumes the input will be provided as space-separated numbers on a single line.

# Read integers from input 
a, b = map(int, input().split())

# Calculate sum of a and b
k = a + b

# Check if the sum is even and output the average or "IMPOSSIBLE"
if k % 2 == 0:
    print(k // 2)  # Use integer division for Python 3
else:
    print("IMPOSSIBLE")
```

To run the test case provided with input "2 16", you can run the Python code and input the test case when prompted. Here's an example of how you might execute the code:

```sh
$ python your_script.py
2 16
9
```

Assuming `your_script.py` is the name of the file containing the above Python code and the `$` represents the command line prompt.
