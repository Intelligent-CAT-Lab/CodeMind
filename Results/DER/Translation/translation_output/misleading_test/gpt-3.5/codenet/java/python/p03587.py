```python
import sys

class AAccepted:
    def solve(self, test_number, input_string):
        n = 0
        for c in input_string:
            if c == '1':
                n += 1
        return n

if __name__ == "__main__":
    input_string = input().strip()
    solver = AAccepted()
    result = solver.solve(1, input_string)
    print(result)
```

# Test Input: 
111100

# Expected Output:
-30
```
