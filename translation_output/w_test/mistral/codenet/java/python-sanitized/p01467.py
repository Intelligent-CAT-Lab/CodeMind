def ni(sc):
    a = [int(c) for c in sc.next().split()]
    return a

def p01467():
    sc = input()
    a = ni(sc)
    b = ni(sc)
    k = int(input())
    max = 0
    for i in range(1 << 10):
        if len(set(int(bit) for bit in bin(i)[2:])) > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j + 1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j + 1] = (i & (1 << j)) > 0 ? 0 : 1
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max = max(max, ans)
    print(max)

p01467()