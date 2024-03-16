Here is the translated code from Java to Python:

```python
import sys

MASK = [1, 2, 4]

def main():
    M = int(sys.stdin.readline().strip())
    result = (24 - M) + 24
    print(result)

if __name__ == "__main__":
    main()
```

When used with an input of `21`, this will produce the expected output of `27`.
