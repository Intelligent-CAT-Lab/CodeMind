```python
import sys

def main():
    n = int(input())
    print(n, end=' ')
    m = n
    i = n - 1
    while i > 0:
        if m % i == 0:
            print(i, end=' ')
            m = i
        i -= 1

if __name__ == "__main__":
    main()
```
