```python
def atcoder_ABC070_B():
    a, b, c, d = map(int, input().split())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    ans = 0
    for i in range(101):
        if array[i] == 2:
            ans += 1
    
    print(ans)

# Test the function with provided input
atcoder_ABC070_B()
```
