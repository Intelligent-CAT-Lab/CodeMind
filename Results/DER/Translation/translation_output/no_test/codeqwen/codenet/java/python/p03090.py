Here is the Python equivalent of the Java code you provided:

```python
import sys

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
    for str in l:
        print(str)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads an integer from the user, calls the `solve` function to generate all possible pairs of numbers that sum up to the input number, and then prints out the number of pairs and the pairs themselves. The `solve` function is a recursive function that generates pairs of numbers for even and odd input numbers.
