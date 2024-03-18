```python
import sys

class ATwoProblems:
    def solve(self, points, t, a, b, ta, tb):
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    return "YES"
        return "NO"

def main():
    input_data = input().split()
    points = int(input_data[0])
    t = int(input_data[1])
    a = int(input_data[2])
    b = int(input_data[3])
    ta = int(input_data[4])
    tb = int(input_data[5])

    solver = ATwoProblems()
    result = solver.solve(points, t, a, b, ta, tb)
    print(result)

if __name__ == "__main__":
    main()
```

Test for the provided input:
```
3 1 20 15 17 5
```

Expected output:
```
NO
```
