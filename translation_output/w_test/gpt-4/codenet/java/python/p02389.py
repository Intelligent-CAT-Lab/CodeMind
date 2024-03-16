Below is the translated Python code from the Java sample you provided:

```python
import sys

class Solution:
    def solve(self):
        a, b = map(int, input().split())
        print(a * b, 2 * a + 2 * b)

if __name__ == "__main__":
    solver = Solution()
    solver.solve()
```

The Python code expects the input to be provided in the same format as the Java code, i.e., two integers separated by a space. The output will be two numbers separated by a space: the first is the product of the two integers, and the second is the perimeter of a rectangle with sides of the provided lengths.

You can test the Python solution with a command-line input like this:

```bash
echo "3 5" | python solution.py
```

Or if you are using an environment that allows direct interaction, simply run the script and type `3 5` followed by Enter.
