class main:
    n = int(input())
    
    o = 0
    e = 0
    
    for i in range(1, n+1):
        if i % 2 == 1:
            o += 1
        else:
            e += 1
    
    print(o*e)