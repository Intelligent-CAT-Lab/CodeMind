```python
def main():
    a, b, c, k = map(int, input().split())
    ans = a - b
    if abs(ans) > 10**18:
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

if __name__ == "__main__":
    main()
```

# Test input
1 2 3 1

# Expected output
-16
```  
