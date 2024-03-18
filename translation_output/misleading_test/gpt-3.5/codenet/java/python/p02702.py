```python
def main():
    # Your code here
    s = input()
    n = len(s)
    p = 2019
    
    # ans: number of partitions of subsegments i to j that are multiples of 2019
    ans = 0
    
    # d'[i]: right to i-th digit value * 10^i (mod 2019)
    d = [0] * (n+1)
    ten = 1
    
    for i in range(n - 1, -1, -1):
        a = ((int(s[i]) - 0) * ten) % p
        d[i] = (d[i+1] + a) % p
        ten = (ten * 10) % p

    map = {}
    for i in range(n, -1, -1):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            map[key] += 1

    for key in map:
        val = map[key]
        ans += (val * (val - 1)) // 2

    print(ans)

if __name__ == "__main__":
    main()
```
```python
# Test
main()
```
```python
# Test input
1817181712114

# Expected output
63
```
