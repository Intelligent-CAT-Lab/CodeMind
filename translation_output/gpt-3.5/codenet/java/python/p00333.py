```python
def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W = int(input())
    H = int(input())
    WH = gcd(W, H)
    C = int(input())
    
    a = (W//WH) * (H//WH)
    
    print(a * C)

if __name__ == "__main__":
    main()
```
