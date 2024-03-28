import math

def main():
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]
    k = int(input())
    max_value = 0
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
                borrow[j+1] = (i & (1 << j)) > 0
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max_value = max(max_value, ans)
    print(max_value)

if __name__ == '__main__':
    main()