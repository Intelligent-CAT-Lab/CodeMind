Here is the Python equivalent of the Java code:

```python
import re

question = input().strip()
original_q = question[:-1].strip()
ch = original_q[-1]
vowels = ["A", "E", "I", "O", "U", "Y"]

if ch.upper() in vowels:
    print("YES")
else:
    print("NO")
```

This Python code does the same thing as the Java code. It reads a line of input, trims it, and then checks if the last character is a vowel. If it is, it prints "YES", otherwise it prints "NO".
