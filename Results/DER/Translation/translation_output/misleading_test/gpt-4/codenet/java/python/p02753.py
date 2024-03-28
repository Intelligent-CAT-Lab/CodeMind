Below is the Java code translated into Python:

```python
# author : Atul Anand
# created on : Tue Mar 31 2020

import sys

def main():
    S = input()
    if S[0] == S[1] and S[1] == S[2]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

# Sample test case
# Test input:
# ABA
#
# Expected output:
# |,s
```

The translation keeps the functionality intact while respecting Pythonic ways to accomplish the task. For example, the `Reader` and `PrintWriter` classes from Java are no longer necessary, as Python has simple built-in functions for reading from `stdin` and printing to `stdout`. Also, exception handling for I/O is typically not explicitly required in simple Python scripts, as any exceptions would typically terminate the script by default (unless you need to handle them for a particular reason).
