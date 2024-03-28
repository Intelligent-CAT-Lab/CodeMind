```python
from math import sin, cos, sqrt, pi

class Solver:
    def solve(self):
        A, B, H, M = map(int, input().split())
        a_x = 1.0 * A * sin(pi * 2 * (H * 60 + M) / 720)
        b_x = 1.0 * B * sin(pi * 2 * M / 60)
        a_y = 1.0 * A * cos(pi * 2 * (H * 60 + M) / 720)
        b_y = 1.0 * B * cos(pi * 2 * M / 60)
        distance = sqrt((a_x - b_x) * (a_x - b_x) + (a_y - b_y) * (a_y - b_y))
        print(distance)

if __name__ == "__main__":
    solver = Solver()
    solver.solve()
```

