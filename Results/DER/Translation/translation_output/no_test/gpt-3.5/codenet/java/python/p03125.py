```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    
    print(a + b if b % a == 0 else b - a)

if __name__ == "__main__":
    main()
```
