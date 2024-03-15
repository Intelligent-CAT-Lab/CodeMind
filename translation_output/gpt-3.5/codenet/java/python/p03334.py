```python
import sys
from io import StringIO
import math

def solve():
    n = scanInt()
    d1 = scanInt()
    d2 = scanInt()
    d1s = 0
    d2s = 0
    while (d1 & 3) == 0:
        d1s += 1
        d1 >>= 2
    while (d2 & 3) == 0:
        d2s += 1
        d2 >>= 2
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if (d1 & 3) == 1 and ((i >> d1s) ^ (j >> d1s)) & 1 != 0:
                continue
            if (d1 & 3) == 2 and (i >> d1s) & 1 != 0:
                continue
            if (d2 & 3) == 1 and ((i >> d2s) ^ (j >> d2s)) & 1 != 0:
                continue
            if (d2 & 3) == 2 and (i >> d2s) & 1 != 0:
                continue
            print(i, j)
            need -= 1
            if need == 0:
                return
    raise AssertionError()

def scanInt():
    return int(scanString())

def scanLong():
    return int(scanString())

def scanString():
    if not hasattr(scanString, "tok") or not scanString.tok:
        scanString.tok = input().strip().split()
    return scanString.tok.pop(0)

def main():
    try:
        # Redirect stdin and stdout
        sys.stdin = StringIO('')  # provide custom input here if needed
        sys.stdout = StringIO()
        
        solve()
        
        # Get output and print
        sys.stdout.seek(0)
        output = sys.stdout.read()
        print(output)
    except Exception as e:
        print(e)
        sys.exit(1)

if __name__ == "__main__":
    main()
```

