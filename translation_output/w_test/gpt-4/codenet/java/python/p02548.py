Here is the translated code from Java to Python:

```python
from sys import stdin

def main():
    n = int(stdin.readline())
    cnt = 0
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            if i * j < n:
                cnt += 1
            else:
                break
    print(cnt)

if __name__ == "__main__":
    main()
```

To test this code, you can run a Python script containing the code above and provide the test input to it via standard input (like using a command line).

Test input:
```
3
```

Expected output:
```
3
```

Note that I used `sys.stdin.readline()` to read the input, which is similar to using a `Scanner` to read input in Java. The `if __name__ == "__main__":` check is a common Python idiom to ensure that the code block is executed only when the script is run directly, not when imported as a module.
