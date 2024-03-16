Here's the translated code from Java to Python:

```python
A, B, C = map(int, input().split())

array = [A, B, C]
array.sort()

if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
    print(0)
else:
    print(array[0] * array[1])
```

You can test this code with the given sample input by using the following commands in a Python environment:

```python
input_str = '3 3 3'  # Test input
print('Test input:', input_str)

# Simulate the standard input with the input string
import io
import sys
sys.stdin = io.StringIO(input_str)

# Now run the translated code
A, B, C = map(int, input().split())

array = [A, B, C]
array.sort()

if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
    print(0)
else:
    print(array[0] * array[1])
```

When you run this, you should get the expected output `9`.
