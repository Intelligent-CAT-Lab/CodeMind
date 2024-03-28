```python
import math

class Solution:
    def solve(self):
        A, B, H, M = map(int, input().split())
        a_x = 1.0 * A * math.sin(math.pi * 2 * (H * 60 + M) / 720)
        b_x = 1.0 * B * math.sin(math.pi * 2 * M / 60)
        a_y = 1.0 * A * math.cos(math.pi * 2 * (H * 60 + M) / 720)
        b_y = 1.0 * B * math.cos(math.pi * 2 * M / 60)
        distance = math.sqrt((a_x - b_x) ** 2 + (a_y - b_y) ** 2)
        print("{:.20f}".format(distance))

if __name__ == "__main__":
    solution = Solution()
    solution.solve()
```  
