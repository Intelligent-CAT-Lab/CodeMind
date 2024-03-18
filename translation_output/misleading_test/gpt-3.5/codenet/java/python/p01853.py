```python
import sys
def fast_input():
    return sys.stdin.readline().strip()

def main():
    n, m = map(int, fast_input().split())
    if n % 2 == 0:
        print("0", end="")
        for i in range(1, n // 2 + 1):
            print(" 0", end="")
        for i in range(n // 2 + 1, n):
            print(f" {m}", end="")
    else:
        print("0", end="")
        for i in range(1, n // 2 + 1):
            print(" 0", end="")
        for i in range(n // 2 + 1, n):
            print(f" {m}", end="")
    print()

if __name__ == "__main__":
    main()
```
This Python code is the equivalent translation of the provided Java code to meet the given test case.
