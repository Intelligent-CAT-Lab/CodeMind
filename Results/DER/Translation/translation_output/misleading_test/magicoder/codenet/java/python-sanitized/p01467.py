def ni(sc):
    a = list(map(int, list(sc.readline().strip())))
    return a

def main():
    import sys
    sc = sys.stdin
    a = ni(sc)
    b = ni(sc)
    k = int(sc.readline())
    max_val = 0
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
                borrow[j+1] = (i & (1 << j)) > 0 and 0 or 1
        ans = 0
        for j in range(9, -1, -1):
            ans = ans * 10 + c[j]
        max_val = max(max_val, ans)
    print(max_val)

if __name__ == "__main__":
    main()