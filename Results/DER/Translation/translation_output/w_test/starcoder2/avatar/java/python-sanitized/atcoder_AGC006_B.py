import sys

def main():
    N, x = map(int, sys.stdin.readline().split())
    if x == 1 or x == 2 * N - 1:
        print("No")
        return
    print("Yes")
    low = x - 1
    high = x + 1
    deq = []
    deq.append(x)
    while low != 0 or high != 2 * N:
        if low == 0:
            deq.insert(0, high)
            deq.append(high + 1)
            high += 2
        elif high == 2 * N:
            deq.append(low)
            deq.insert(0, low - 1)
            low -= 2
        else:
            deq.insert(0, low)
            low -= 1
            deq.append(high)
            high += 1
    for s in deq:
        print(s)

if __name__ == "__main__":
    main()