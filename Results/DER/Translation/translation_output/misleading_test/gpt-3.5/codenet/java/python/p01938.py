```python
import sys

user_input = sys.stdin.readline().strip()
a = 'A'
sum = 0

for char in user_input:
    if char <= a:
        sum += 1
    a = char

print(sum)
```
Test the code with the given input to verify that it works correctly.
