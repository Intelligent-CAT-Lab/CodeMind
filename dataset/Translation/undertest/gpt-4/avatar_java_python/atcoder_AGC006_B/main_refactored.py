class main:
    from collections import deque
    
    # Read from standard input
    inputs = input().split()
    N = int(inputs[0])
    x = int(inputs[1])
    
    if x == 1 or x == 2 * N - 1:
        print("No")
    else:
        print("Yes")
        low = x - 1
        high = x + 1
        deq = deque([x])
    
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