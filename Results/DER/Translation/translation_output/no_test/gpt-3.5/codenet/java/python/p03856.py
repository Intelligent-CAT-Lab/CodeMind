```python
import sys
import math

def read_line():
    return sys.stdin.readline().strip()

def possibility_check(s):
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

    return poss[len(s)]

def main():
    qq = int(input().strip())
    for casenum in range(1, qq+1):
        s = read_line()
        result = "YES" if possibility_check(s) else "NO"
        print(result)

if __name__ == "__main__":
    main()
```
