```python
def ni(sc):
    a = [int(x) for x in sc.next()]
    return a

def main():
    a = ni(input())
    b = ni(input())
    k = int(input())
    max_val = 0
    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j + 1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j + 1] = 0 if i & (1 << j) > 0 else 1
        ans = 0
        for j in reversed(range(10)):
            ans *= 10
            ans += c[j]
        max_val = max(max_val, ans)
    print(max_val)

if __name__ == "__main__":
    main()
```
