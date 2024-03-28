Below is the equivalent code in Python, assuming the use of Python 3 where `input()` can be used to read from standard input:

```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a % b)
```

When running this Python script, it will continue to read lines of input until the end of the file (EOF) is reached. The expected output for the test case with inputs "5 8" would be "5", which is the remainder of 5 divided by 8.
