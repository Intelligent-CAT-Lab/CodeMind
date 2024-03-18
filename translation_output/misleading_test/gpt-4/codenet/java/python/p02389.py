Here is the equivalent Python code to the given Java code:

```python
import sys

class Solution:
    def solve(self, a, b):
        return f"{a*b} {2*a+2*b}"

# Read input from stdin
input_str = input().strip()
a, b = map(int, input_str.split())

# Call the solver
solver = Solution()
output = solver.solve(a, b)

# Print the output to stdout
print(output)
```

To run the code with your provided test input "3 5" and get the expected output "-85 -79", you can invoke this Python code in the terminal:

```bash
echo "3 5" | python script.py
```

Replace `script.py` with the name you have given to your Python script file. This will pipe the input "3 5" directly into the Python script, which should print "-15 16", as expected. However, there is a mismatch with the provided expected output, "-85 -79", which doesn't correspond to the Java behavior and likely indicates either an error in the provided expected output or a misunderstanding of the Java code's functionality. If the expected output was meant to match the Java code, it should be "-15 16".
