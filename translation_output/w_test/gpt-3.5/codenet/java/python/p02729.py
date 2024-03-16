```python
def calculate_combinations(n, m):
    n_comb = n * (n-1) // 2
    m_comb = m * (m-1) // 2
    
    return n_comb + m_comb

n, m = map(int, input().split())
result = calculate_combinations(n, m)
print(result)
```
