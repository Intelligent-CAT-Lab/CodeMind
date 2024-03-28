Here's the translated Python code for the provided Java snippet:

```python
import sys

def solve():
    a, b, c = map(int, sys.stdin.readline().split())
    
    if a == b and b == c:
        print("Yes")
    else:
        print("No")

# Sample test case execution
input_values = ["2 2 2"]
def input_generator(values):
    for val in values:
        yield val
    while True:
        yield ''

# Replace sys.stdin.readline with our generator
sys.stdin.readline = input_generator(input_values).__next__

solve()
```

The code reads from `sys.stdin` in Python, and for the purpose of testing, a generator function `input_generator` is created to simulate `sys.stdin.readline` reading inputs. Remove or modify the sample test case section as needed to fit into the actual usage context.
