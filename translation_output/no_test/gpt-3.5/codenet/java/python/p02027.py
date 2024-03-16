```python
dp = {}

def search(num, count, max_val):
    if count == 0:
        return 1
    if num in dp and count in dp[num]:
        return dp[num][count]
    
    total = 0
    for i in range(2, max_val // (num * 2**(count - 1)) + 1):
        total += search(num * i, count - 1, max_val)
    
    if num in dp:
        dp[num][count] = total
    else:
        dp[num] = {count: total}
    
    return total

if __name__ == "__main__":
    n, k = map(int, input().split())
    total = 0
    for i in range(1, n // 2**(k - 1) + 1):
        total += search(i, k - 1, n)
    print(total)
```
