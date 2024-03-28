```python
def calculate_borrow(o, n, g):
    x = sum(i * o for i in range(1, g + 1))
    borrow = x - n
    return max(borrow, 0)

# Test input
o, n, g = map(int, input().split())
result = calculate_borrow(o, n, g)
print(result)
```

To test the provided input `1000 1000000000 1000` with the expected output `0`, you can run the above Python code and input the values when prompted.
