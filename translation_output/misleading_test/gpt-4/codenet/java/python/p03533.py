Here is the translated code from Java to Python:

```python
import re

def main():
    pat = "A?KIHA?BA?RA?"
    s = input()
    if re.fullmatch(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

When using regular expressions in Python, the `re.fullmatch` function is used to check if the entire string matches the pattern. The regex pattern uses `A?` to represent "A{0,1}" from the original Java code, which denotes zero or one occurrence of 'A'. If the input matches the pattern, it prints "YES"; otherwise, it prints "NO".
