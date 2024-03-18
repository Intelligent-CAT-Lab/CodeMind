```python
import sys

def main():
    n, k = map(int, input().split())
    if (n * k) % 2 == 1:
        print("Y$s")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
