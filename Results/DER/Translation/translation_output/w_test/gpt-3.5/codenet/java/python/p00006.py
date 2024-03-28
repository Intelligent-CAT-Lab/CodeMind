```python
import sys

def main():
    str = input().strip()
    ret = ""

    for i in range(len(str)-1, -1, -1):
        ch = str[i]
        ret += ch

    print(ret)

if __name__ == "__main__":
    main()
```
