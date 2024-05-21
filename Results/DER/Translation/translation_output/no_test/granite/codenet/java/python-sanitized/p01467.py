import sys

def ni(sc):
    a = [0] * 10
    c = sc.next()
    for i in range(len(c)):
        a[i] = ord(c[len(c)-1-i]) - ord('0')
    return a

def main():
    sc = sys.stdin
    a = ni(sc)
    b = ni(sc)
    k = int(sc.next())
    max = 0
    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j+1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j+1] = (i & (1 << j)) > 0? 0 : 1
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max = max(max, ans)
    print(max)

main()