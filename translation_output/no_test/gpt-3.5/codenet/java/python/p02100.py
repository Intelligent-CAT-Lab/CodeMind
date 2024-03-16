```python
def main():
    arr = input()
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6

    for c in arr:
        if c == '+':
            if xs:
                keis[1] = num if plus else -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                keis[1] = num if plus else -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = int(c)
                keis[v] = num if plus else -num
                si = False
            else:
                num = num * 10 + int(c)

    if plus:
        keis[0] = num
    else:
        keis[0] = -num

    ji = 0
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break

    ans = [0] * ji
    for i in range(1, abs(keis[0]) + 1):
        for j in range(6):
            result = sum(pow(i, j) * keis[j] for j in range(6))
            if result == 0:
                ji -= 1
                ans[ji] = -i
            result = sum(pow(-i, j) * keis[j] for j in range(6))
            if result == 0:
                ji -= 1
                ans[ji] = i

    ans.sort()
    sb = ""
    for i in ans:
        sb += f"(x{'+' if i >= 0 else ''}{i})"
    
    print(sb)


if __name__ == "__main__":
    main()
```
