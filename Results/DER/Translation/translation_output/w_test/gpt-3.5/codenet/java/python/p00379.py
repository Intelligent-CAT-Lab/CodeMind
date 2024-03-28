```python
def main():
    a, n, m = map(int, input().split())
    max_val = int(m**(1/n))
    
    ans = 0
    for i in range(1, max_val+1):
        x = i**n
        y = sum(int(digit) for digit in str(x))
        
        if y + a == i:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()
```
