import sys

def p00389():
    base = int(input())
    K = int(input())
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

if __name__ == "__main__":
    p00389()