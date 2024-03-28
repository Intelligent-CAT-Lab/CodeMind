import sys

def p00389():
    base, K = map(int, sys.stdin.readline().strip().split())
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            mid = (low + high) // 2
            if mid <= K * (base - mid):
                low = mid
            else:
                high = mid
        next = low
        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)

if __name__ == '__main__':
    p00389()