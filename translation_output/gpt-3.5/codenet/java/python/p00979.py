```python
low = 1
high = 3 ** 32

def main():
    n = int(input())
    ans = -1 if n == 0 else dfs(1, 1)
    print(ans + 1)

def dfs(pos, pace):
    if pos > n:
        return 0

    # 3.0X
    if pace < high:
        npace = 3 * pace
        npos = pos + npace
        if (npos == n and (npace == 1 or npace == 3)):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp

    # 1.0X
    npace = pace
    npos = npace + pos
    if (npos == n and (npace == 1 or npace == 3)):
        return 1
    else:
        temp = dfs(npos, npace)
        if temp != 0:
            return 1 + temp

    # 0.3X
    if pace > low:
        npace = pace // 3
        npos = pos + npace
        if (npos == n and (npace == 3 or npace == 1)):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp

    return 0

if __name__ == "__main__":
    main()
```
