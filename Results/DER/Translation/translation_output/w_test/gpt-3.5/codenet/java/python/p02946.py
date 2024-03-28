```python
def main():
    K, X = map(int, input().split())
    
    for i in range(X - K + 1, X + K):
        if i != X + K - 1:
            print(i, end=' ')
        else:
            print(i)
    
if __name__ == "__main__":
    main()
```

# Test Input
3 7

# Expected Output
5 6 7 8 9
```
