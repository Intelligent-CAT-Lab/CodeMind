Below is the Python translation of the provided Java code:

```python
import sys

class P02198:
    def main(self):
        N, M = map(int, input().split())
        print(N * M)
        return False

    def __init__(self):
        self.systemin = sys.stdin
        self.log = open(os.devnull, 'w')

def main():
    instance = P02198()
    instance.main()

if __name__ == "__main__":
    main()
```

To test this with the provided inputs:

Test input:
```
3 4
```

Execute the Python code and input `3 4` when prompted to do so, or redirect the input from a file or using `echo` command in the terminal.

Expected output:
```
12
```
