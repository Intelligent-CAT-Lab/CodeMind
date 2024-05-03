Here is the Python equivalent of the Java code:

```python
import re

def main():
    a, b, c = re.split(',', input())
    print(a, b, c)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `re.split` function to split the input string at each comma and store the resulting substrings in the variables `a`, `b`, and `c`. Then we print these variables separated by a space.
