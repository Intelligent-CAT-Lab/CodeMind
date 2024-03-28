```python
import sys

def main():
    d, t, s = map(int, sys.stdin.readline().split())
    time_needed = d / s
    if time_needed <= t:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

