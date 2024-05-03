Here is the Python equivalent of the Java code:

```python
import re

def main():
    S = input()
    S = re.sub("eraser", "-", S)
    S = re.sub("erase", "-", S)
    S = re.sub("dreamer", "-", S)
    S = re.sub("dream", "-", S)
    S = S.replace("-", "")
    if len(S) == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, replaces all occurrences of "eraser", "erase", "dreamer", and "dream" with "-", and then checks if the resulting string is empty. If it is, it prints "YES", otherwise it prints "NO".
