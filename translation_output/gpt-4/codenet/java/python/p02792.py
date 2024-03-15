Here's the translated code from Java to Python:

```python
from collections import defaultdict

# Input
n = int(input())

# Calculation
result = 0
array = defaultdict(int)
for i in range(1, n + 1):
    head = int(str(i)[0])
    tail = i % 10
    array[(head, tail)] += 1

for i in range(1, n + 1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[(tail, head)]

# Output
print(result)
```

The Java original code contains some non-ASCII comments that seem to be instructions and comments in another language. In the Python translation, I have omitted these comments and focused on the logic part of the code. The `Scanner` class and custom array usage in Java are substituted with Python's `input function` and a `collections.defaultdict` for counting occurrences of the pairs.

Note that in the original Java code, a direct array access for the pairs `(head, tail)` is used with `array[head][tail]`, which would translate to a 2D list array in Python, but I preferred using a `defaultdict(int)` for simplicity in dynamic pair counting without initializing a 10x10 0-filled matrix. To more closely match the Java approach, you could initialize a 10x10 list of lists and use indices to increment the counts.
