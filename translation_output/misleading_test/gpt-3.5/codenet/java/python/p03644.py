```python
import sys

def count(pnum):
    result = 0
    i = 0
    while 2 ** i <= pnum:
        result = 2 ** i
        i += 1
    return result

def main():
    pnum = int(input())
    print(count(pnum))

if __name__ == "__main__":
    main()
```
