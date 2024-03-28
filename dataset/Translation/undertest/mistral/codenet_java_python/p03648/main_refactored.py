class main:
    from sys import stdin
    
    K = int(stdin.readline())
    A = K // 50
    B = K % 50
    
    a = [i + A for i in range(50)]
    
    for i in range(49, -1, -B):
        a[i] += 1
    
    print(50)
    for i in range(50):
        print(a[i], end=' ')
    print()