```python
import sys

def get_array_int():
    return list(map(int, input().split()))

def ff(combination_sum):
    return combination_sum % (10**9 + 7)

def combination_sum(n, coins, l):
    if n < 0:
        return -1
    if n == 0:
        return l

    coin_count = sys.maxsize
    for coin in coins:
        curr_coin = combination_sum(n - coin, coins, l + 1)
        if curr_coin == -1:
            continue
        if curr_coin < coin_count:
            coin_count = curr_coin

    if coin_count == sys.maxsize:
        return -1
    return coin_count

if __name__ == "__main__":
    insn = get_array_int()
    a, b, c, d = insn[0], insn[1], insn[2], insn[3]

    t = c // b
    tt = c % b
    y = a // d
    u = a % d

    while a >= 0 or c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            break
        a = a - d
        if a <= 0:
            print("No")
            break
```
