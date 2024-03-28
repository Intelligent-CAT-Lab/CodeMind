```python
def atcoder_ABC149_B():
    A, B, K = map(int, input().split())
    n = A - K
    
    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", A + B - K)
    else:
        print(n, B)

# Test case
atcoder_ABC149_B()
```

