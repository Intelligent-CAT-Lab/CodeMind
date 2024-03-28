class main:
    import sys
    
    N = int(input())
    
    x = N
    y = 0
    out = [0] * 11
    
    for i in range(11):
        x = x - 1
        y = x % 26
        x = x // 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
    
    for i in range(10, -1, -1):
        if out[i] == chr(0):
            continue
        print(out[i], end='')