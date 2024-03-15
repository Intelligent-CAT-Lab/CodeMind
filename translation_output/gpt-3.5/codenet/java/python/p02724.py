```python
import sys

def main():
    X = int(input())
    
    gohyaku = X // 500
    X = X - 500 * gohyaku
    
    goen = X // 5
    
    print(1000 * gohyaku + 5 * goen)

if __name__ == "__main__":
    main()
```
