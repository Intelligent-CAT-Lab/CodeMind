import sys

def main():
    sc = sys.stdin
    while sc.has_next_int():
        N = sc.next_int()
        x = sc.next_int()
        if x == 1 or x == 2 * N - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        deq = [x]
        while low != 0 or high != 2 * N:
            if low == 0:
                deq.append(high)
                deq.append(high + 1)
                high += 2
            elif high == 2 * N:
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