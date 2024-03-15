import sys

def main():
    n = int(sys.stdin.readline())
    x = int(sys.stdin.readline())
    if x == 1 or x == 2 * n - 1:
        print("No")
        return
    print("Yes")
    low = x - 1
    high = x + 1
    deq = []
    deq.append(x)
    while low != 0 or high != 2 * n:
        if low == 0:
            deq.append(high)
            deq.append(high + 1)
            high += 2
        elif high == 2 * n:
            deq.append(low)
            deq.append(low - 1)
            low -= 2
        else:
            deq.append(low)
            low -= 1
            deq.append(high)
            high += 1
    for s in deq:
        print(s)

if __name__ == "__main__":
    main()