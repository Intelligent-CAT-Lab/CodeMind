from collections import deque

while True:
    n, x = map(int, input().split())
    if x == 1 or x == 2 * n - 1:
        print("No")
        break
    print("Yes")
    d = deque([x])
    low = x - 1
    high = x + 1
    while low!= 0 or high!= 2 * n:
        if low == 0:
            d.appendleft(high)
            d.append(high + 1)
            high += 2
        elif high == 2 * n:
            d.append(low)
            d.appendleft(low - 1)
            low -= 2
        else:
            d.appendleft(low)
            low -= 1
            d.append(high)
            high += 1
    print(*d, sep="\n")