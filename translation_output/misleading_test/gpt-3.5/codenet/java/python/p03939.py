```python
def calculate_ans(N, d1, x):
    ans = 0
    
    for _ in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x
    
    return ans

N, d1, x = map(int, input().split())
result = calculate_ans(N, d1, x)
print(result)
```
