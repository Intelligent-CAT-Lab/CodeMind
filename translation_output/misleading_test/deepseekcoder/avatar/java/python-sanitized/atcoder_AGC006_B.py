import sys
from collections import deque

def solve(N, x):
    if x == 1 or x == 2 * N - 1:
        print("No")
        return
    print("Yes")
    low = x - 1
    high = x + 1
    dq = deque()
    dq.append(x)
    while low != 0 or high != 2 * N:
        if low == 0:
            dq.appendleft(high)
            dq.append(high + 1)
            high += 2
        elif high == 2 * N:
            dq.append(low)
            dq.appendleft(low - 1)
            low -= 2
        else:
            dq.appendleft(low)
            low -= 1
            dq.append(high)
            high += 1
    for s in dq:
        print(s)

def main():
    N, x = map(int, sys.stdin.readline().split())
    solve(N, x)

if __name__ == "__main__":
    main()