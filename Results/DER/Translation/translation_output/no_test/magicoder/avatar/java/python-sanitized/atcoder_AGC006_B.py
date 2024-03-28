import sys
from collections import deque

for line in sys.stdin:
    N, x = map(int, line.split())
    if x == 1 or x == 2 * N - 1:
        print("No")
        break
    print("Yes")
    low = x - 1
    high = x + 1
    deq = deque()
    deq.append(x)
    while low != 0 or high != 2 * N:
        if low == 0:
            deq.appendleft(high)
            deq.append(high + 1)
            high += 2
        elif high == 2 * N:
            deq.append(low)
            deq.appendleft(low - 1)
            low -= 2
        else:
            deq.appendleft(low)
            low -= 1
            deq.append(high)
            high += 1
    for s in deq:
        print(s)