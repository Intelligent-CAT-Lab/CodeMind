```python
import sys

try:
    input_str = sys.stdin.readline().strip()
    s = input_str.split(" ")
    i1 = int(s[0])
    i2 = int(s[1])

    count = i1 // i2
    count += i1 % i2
    print(count)
except:
    print("An error occurred while reading input.")
```

