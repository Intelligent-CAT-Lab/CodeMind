```python
import sys

def main():
    n = int(sys.stdin.readline())
    ans = 0
    for i in range(1, int(n ** 0.5) + 1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                ans += m
    
    print(ans)

if __name__ == "__main__":
    main()
```
