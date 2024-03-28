```python
import sys

def main():
    a, b, c = map(int, input().split())
    amount = 0
    time = a 
    
    i = 2
    while time <= c + 0.5:
        amount += b
        time = a * i
        i += 1
        
    print(amount)

if __name__ == "__main__":
    main()
```
