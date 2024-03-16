```python
def p03345():
    a, b, c, k = map(int, input().split())
    ans = a - b
    if abs(ans) > 10**18:
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(-ans)

# Sample Test Case
p03345()
```
