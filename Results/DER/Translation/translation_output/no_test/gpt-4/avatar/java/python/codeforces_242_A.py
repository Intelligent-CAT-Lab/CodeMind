Here is the translated python code:

```python
def debug(*args):
    print(*args, file=sys.stderr)

def main():
    x, y, a, b = map(int, input().split())
    res = []
    for i in range(a, x + 1):
        for j in range(b, y + 1):
            if i <= j:
                continue
            res.append(f"{i} {j}")
    print(len(res))
    for s in res:
        print(s)

if __name__ == "__main__":
    import sys
    main()
```

This Python code assumes that your environment is set up for reading from standard input and writing to standard output. It's important to note that Python does not have an explicit `PrintWriter` as Java does, as printing in Python is already buffered by default. Also, the `debug` function is defined simply to match the original Java code, and it prints to standard error using `print` with the `file=sys.stderr` argument.
