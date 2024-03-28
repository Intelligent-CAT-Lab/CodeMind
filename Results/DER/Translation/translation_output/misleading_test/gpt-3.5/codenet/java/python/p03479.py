```python
import sys

class Solution:
    def __init__(self, input_str):
        self.is_debug = False
        self.INPUT = input_str.encode()
    
    def solve(self):
        x, y = map(int, input().split())
        ans = 0
        while x <= y:
            ans += 1
            x *= 2
        print(ans)

    def run(self):
        self.is = sys.stdin if not self.INPUT else sys.stdin.buffer
        self.out = sys.stdout

        self.solve()

        self.out.flush()
    
# Test input
input_str = '3 20\n'
sol = Solution(input_str)
sol.run()
```
```python
# Test output
70
```
```python
# Code Explanation
1. Create a `Solution` class that reads input and solves the problem.
2. Inside the `solve` method:
    - Read integers `x` and `y` from input.
    - Initialize `ans` to 0.
    - Loop while `x` is less than or equal to `y`, increment `ans` by 1 and multiply `x` by 2 in each iteration.
    - Print the final `ans`.
3. In the `run` method:
    - Set the input stream based on initial string or stdin.
    - Call the `solve` method.
    - Flush the output.
4. Initialize the `Solution` object with the test input and run the code.
```
