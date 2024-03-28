```python
def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max_val = 0
    for j in range(pow):
        max_val = max_val * 10 + 9
    return a * (max_val - a)

if __name__ == "__main__":
    l, r = map(int, input().split())
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = temp // 2 * (temp - temp // 2)
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        if l <= temp // 2 and temp // 2 <= r:
            res = max(maxxes[i], res)
    print(res)
```
```python
# Test Input: 999999999 999999999
# Expected Output: -60
```
