Here is the Python equivalent of the Java code:

```python
import sys

def solve(M, rD, rR, cD, cR):
    max_val = -1
    for i in range(100):
        for j in range(100):
            changeD = (100 * cD + rD - 1) // rD
            changeR = (100 * cR + rR - 1) // rR
            jpn = M - changeD - changeR
            if jpn < 0:
                continue
            remD = changeD * rD // 100 - cD
            remR = changeR * rR // 100 - cR
            jpn += remD * 100 // rD + remR * 100 // rR
            max_val = max(max_val, jpn)
    return max_val

def main():
    M, rD, rR, cD, cR = map(int, sys.stdin.readline().split())
    print(solve(M, rD, rR, cD, cR))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input from the standard input, solves the problem, and prints the result. The `solve` function is the same as the `solve` method in the Java code. The `main` function is the same as the `run` method in the Java code. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
