Here's the translated version of the Java code into Python, using string manipulation features which are native to Python:

```python
def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy
    
    result = []
    # sx < tx, sy < ty, therefore can be done in a specific pattern
    # first
    result.append('R' * dx)
    result.append('U' * dy)
    
    # second
    result.append('L' * dx)
    result.append('D' * dy)
    
    # third
    result.append('D')
    result.append('R' * (dx + 1))
    result.append('U' * (dy + 1))
    result.append('L')
    
    # forth
    result.append('U')
    result.append('L' * (dx + 1))
    result.append('D' * (dy + 1))
    result.append('R')
    
    return ''.join(result)

if __name__ == "__main__":
    sx, sy, tx, ty = map(int, input().split())
    
    print(solve(sx, sy, tx, ty))
```

A few notes about the translation:
- In Python, we don't need to import anything to get the equivalent functionality of the Java Scanner class. We can simply use `input()` to get input from the user and `split()` to separate the input string into parts.
- Python doesn't need a `renzoku` function equivalent because string multiplication achieves the same result (e.g., `'R' * dx` will repeat the character 'R' `dx` times).
- To concatenate strings in Python, you can use the `join()` method on an empty string `''`, which is typically more efficient than concatenating with '+=' in a loop.
