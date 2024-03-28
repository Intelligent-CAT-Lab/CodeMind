```python
import sys

def main():
    n = int(sys.stdin.readline())

    result = (n * 800) - ((n // 15) * 200)
    print(result)

if __name__ == "__main__":
    main()
```
