```python
import sys

def main():
    d, t, s = map(int, sys.stdin.readline().strip().split())
    ans = d / s
    if ans <= t:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
