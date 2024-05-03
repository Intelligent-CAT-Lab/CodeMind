Here is the Python equivalent of the Java code:

```python
import re

def main():
    str = input()
    print("A" if re.match("[A-Z]", str) else "a")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `re` module to perform regular expression matching. The `re.match()` function attempts to apply the regular expression pattern at the start of the string. If the pattern matches, it returns a match object; otherwise, it returns `None`. We then use a ternary operator to print "A" if the match object is not `None` (i.e., the string starts with an uppercase letter), and "a" otherwise.
