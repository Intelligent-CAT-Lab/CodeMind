```python
import sys

class ATwoProblems:
    def solve(self, in_data):
        points, t, a, b, ta, tb = in_data
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    print("YES")
                    return
        print("NO")


if __name__ == "__main__":
    in_data = list(map(int, input().split()))
    solver = ATwoProblems()
    solver.solve(in_data)
```

