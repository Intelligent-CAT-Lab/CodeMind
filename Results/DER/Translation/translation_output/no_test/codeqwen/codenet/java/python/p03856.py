Here is the Python equivalent of the Java code you provided:

```python
import sys

def main():
    qq = sys.maxsize
    for casenum in range(1, qq+1):
        s = input()
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [False] * (len(s) + 1)
        poss[0] = True
        for i in range(len(s)):
            if not poss[i]:
                continue
            for out in good:
                if i + len(out) > len(s):
                    continue
                match = 0
                for a in range(len(out)):
                    if out[a] == s[i+a]:
                        match += 1
                if match == len(out):
                    poss[i+match] = True
        print("YES" if poss[-1] else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads a string from the user, checks if it can be formed by concatenating the strings in the `good` list in some order, and prints "YES" if it can, and "NO" otherwise. The `sys.maxsize` is used to set the number of test cases to infinity.
