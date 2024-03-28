```python
import sys

class Solution:
    def solve(self):
        a, b = map(int, input().split())
        print(a*b, 2*a+2*b)

if __name__ == "__main__":
    solver = Solution()
    solver.solve()
```
Test case for the above solution:
```python
sys.stdin = open("input.txt", "r")
solver = Solution()
solver.solve()
```
