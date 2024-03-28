Here is the translated code from Java to Python:

```python
from collections import Counter

e = list(map(int, input().split()))

if len(set(e)) > 3:
    print("no")
else:
    e.sort()
    distinct_counts = Counter(e).values()
    for count in distinct_counts:
        if count not in [4, 8, 12]:
            print("no")
            break
    else:
        print("yes")
```

Now to test the code with the provided test input:

```python
# run this portion in the Python environment/input console
# Test input:
# 1 1 3 4 8 9 7 3 4 5 5 5

# Expected output:
# Ys (where 'Ys' is a typo and the expected output should be 'yes')
```

Make sure that you enter the input when prompted after running the program.
