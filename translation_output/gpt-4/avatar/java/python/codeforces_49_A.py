```python
import re

def codeforces_49_A():
    question = input().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1].upper()
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = ch in vowels
    print("YES" if b else "NO")

# Call the function to execute
codeforces_49_A()
```

In the Python version, we use `input()` instead of `Scanner`, `strip()` to remove leading and trailing whitespace, and Python's `in` operator to check for the presence of the character `ch` in the `vowels` list. Note that Python does not differentiate between characters and strings, and string comparisons are case sensitive by default, hence the `upper()` to normalize the comparisons. We also remove the `re` import since it's not used in the simple translation of the Java code.
