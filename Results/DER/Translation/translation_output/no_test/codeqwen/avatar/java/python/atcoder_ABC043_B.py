Here is the Python equivalent of the Java code:

```python
import re

def main():
    s = input()
    
    while "0B " in s or "1B " in s:
        s = s.replace("0B ", "")
        s = s.replace("1B ", "")
    
    s = s.replace(" B ", "")
    
    print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, replaces occurrences of "0B " and "1B " with an empty string, and then replaces " B " with an empty string. The result is then printed to the console.
