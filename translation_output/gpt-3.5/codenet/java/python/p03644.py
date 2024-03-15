```python
import sys

def count(pnum):
    result = 0
    i = 0
    while 2 ** i <= pnum:
        result = 2 ** i
        i += 1
    return result

def run():
    out = sys.stdout
    pnum = int(input())
    out.write(str(count(pnum)))
    out.close()

if __name__ == "__main__":
    run()
```
