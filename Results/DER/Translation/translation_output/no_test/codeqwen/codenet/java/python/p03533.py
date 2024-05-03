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

In Python, we use the `re` module for regular expressions. The `re.match()` function checks if the regular expression matches at the beginning of the string. If it does, it returns a match object; otherwise, it returns `None`. We then use the `print()` function to print "YES" or "NO" based on whether the match object is `None` or not.
