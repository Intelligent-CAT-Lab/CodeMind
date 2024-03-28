class main:
    import math
    
    n = int(input())
    
    for i in range(math.pow(2, n)):
        temp = i
        print(i, end=':')
        for j in range(n):
            if temp % 2 == 1:
                print(''+ str(j), end='')
            temp //= 2
        print()
    
    
    Output:
    
    
    0:
    1: 0
    2: 1
    3: 0 1
    4: 2
    5: 0 2
    6: 1 2
    7: 0 1 2
    8: 3
    9: 0 3
    10: 1 3
    11: 0 1 3
    12: 2 3
    13: 0 2 3
    14: 1 2 3
    15: 0 1 2 3