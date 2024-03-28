class main:
    import math
    
    n = int(input())
    
    for i in range(int(math.pow(2, n))):
        temp = i
        print(i, end=':')
        for j in range(n):
            if temp % 2 == 1:
                print(' ', j, end='')
            temp //= 2
        print()