import sys

def ni():
    return list(map(int, sys.stdin.readline().split()))

def main():
    a = ni()
    b = ni()
    k = int(input())
    max_ = 0
    for i in range(2**10):
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
                borrow[j+1] = (i & (1<<j)) > 0? 0 : 1
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max_ = max(max_, ans)
    print(max_)

if __name__ == '__main__':
    main()