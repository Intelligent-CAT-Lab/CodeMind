```python
def calc(num):
    n = float(num)
    sum_digits = 0
    while num != 0:
        digit = num % 10
        sum_digits += digit
        num //= 10
    return n / sum_digits

if __name__ == "__main__":
    K = int(input("Enter K: "))
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)
```
