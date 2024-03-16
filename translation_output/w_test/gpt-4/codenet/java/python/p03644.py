Below is the provided Java code translated into Python:

```python
import math

def run():
    pnum = int(input())
    print(count(pnum))

def count(pnum):
    result = 0
    i = 0
    while math.pow(2, i) <= pnum:
        result = int(math.pow(2, i))
        i += 1
    return result

if __name__ == "__main__":
    run()
```

This Python code mimics the structure of the original Java program, reading from standard input and printing to the standard output.

When you run this script and provide `7` as an input, the expected output should be `4`.
