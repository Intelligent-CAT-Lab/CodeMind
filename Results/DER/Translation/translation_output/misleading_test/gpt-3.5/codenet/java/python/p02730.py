```python
import sys

def main():
    s = input()

    for i in range(len(s) // 2):
        if s[i] != s[-1 - i]:
            print("No", end='', flush=True)
            return

    for i in range(len(s) // 2 - 1):
        if s[i] != s[len(s) // 2 - 1 - i]:
            print("No", end='', flush=True)
            return

    print("Yes", end='', flush=True)

if __name__ == "__main__":
    main()
```
Test the code with the provided sample test case.
