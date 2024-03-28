Here's the translation of the Java code provided into Python:

```python
from collections import Counter

def codeforces_276_B():
    s = input()
    ar = Counter(s)
    
    cntod = sum(1 for count in ar.values() if count % 2 != 0)
    
    if cntod == 0:
        print("First")
    else:
        if cntod % 2 == 0:
            print("Second")
        else:
            print("First")

if __name__ == "__main__":
    codeforces_276_B()
```

The Python code uses the `Counter` class from the `collections` module to count the occurrences of each character in the string, which replaces the need for manually counting using an array as in the Java implementation. Python's string manipulation and iteration are also a bit simpler and more direct than Java's.
