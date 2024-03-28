```python
import sys

class Solution:
    def solve(self):
        a, b = map(int, input().split())
        print(a*b, 2*a+2*b)

def main():
    solver = Solution()
    solver.solve()

if __name__ == "__main__":
    main()
```
