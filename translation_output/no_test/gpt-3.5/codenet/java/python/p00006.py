```python
import sys

def main():
    str = input().strip()
    ret = ""
    for i in range(len(str)):
        ch = str[len(str) - i - 1]
        ret += ch
    print(ret)

if __name__ == "__main__":
    main()
```
