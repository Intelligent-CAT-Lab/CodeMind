```python
import sys

class TaskA:
    def solve(self, t, s, q):
        sum = 0
        while s < t:
            s *= q
            sum += 1
        return sum

def main():
    input_lines = sys.stdin.readlines()
    t, s, q = map(int, input_lines[0].strip().split())
    solver = TaskA()
    result = solver.solve(t, s, q)
    print(result)

if __name__ == "__main__":
    main()
```

