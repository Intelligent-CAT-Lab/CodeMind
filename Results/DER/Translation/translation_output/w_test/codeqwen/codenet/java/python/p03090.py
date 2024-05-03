Here is the Python equivalent of the Java code you provided:

```python
def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(f"{i} {j}")
                l.append(f"{i} {a - j + 1}")
                l.append(f"{a - i + 1} {j}")
                l.append(f"{a - i + 1} {a - j + 1}")
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(f"{a} {i}")

def main():
    a = int(input())
    l = []
    solve(a, l)
    print(len(l))
    for s in l:
        print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it generates all possible pairs of numbers that sum up to `a` and prints them out. The main difference is that Python uses `print` instead of `System.out.println` and `input` instead of `Scanner.nextInt`. Also, Python uses `f-string` for string formatting, which is a more Pythonic way of formatting strings.
