Here is the Python equivalent of the Java code:

```python
import re

def main():
    s = input()
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    if re.match(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if it matches the regular expression pattern, and prints "YES" or "NO" accordingly.
