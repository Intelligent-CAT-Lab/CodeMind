```python
# 0306
def main():
    n = int(input())
    a = [0] * 15
    i = 0
    while n > 0:
        a[i] = (n + 1) % 3 - 1
        n = (n - a[i]) // 3
        i += 1
    while i > 0:
        sign = '0' if a[i-1] == 0 else '+' if a[i-1] > 0 else '-'
        print(sign, end='' if i == 1 else '\n')
        i -= 1

if __name__ == "__main__":
    main()
```
