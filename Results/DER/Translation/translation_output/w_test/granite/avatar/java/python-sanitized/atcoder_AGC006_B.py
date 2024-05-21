import sys
from collections import deque

def main():
    for line in sys.stdin:
        n, x = map(int, line.split())
        if x == 1 or x == 2 * n - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        dq = deque([x])
        while low!= 0 or high!= 2 * n:
            if low == 0:
                dq.appendleft(high)
                dq.append(high + 1)
                high += 2
            elif high == 2 * n:
                dq.append(low)
                dq.appendleft(low - 1)
                low -= 2
            else:
                dq.appendleft(low)
                low -= 1
                dq.append(high)
                high += 1
        print("\n".join(map(str, dq)))

if __name__ == "__main__":
    main()