import sys

def main():
    base, K = map(int, sys.stdin.readline().split())
    next = 0
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            willNext = (low + high) // 2
            if willNext <= K * (base - willNext):
                low = willNext
            else:
                high = willNext
        next = low

        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)

if __name__ == '__main__':
    main()