Here's the translated Python code from the provided Java snippet:

```python
import re

def main():
    pat = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    s = input()
    if re.fullmatch(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code uses the `re` module for regular expression matching, similar to the Java code's `.matches()` method.
