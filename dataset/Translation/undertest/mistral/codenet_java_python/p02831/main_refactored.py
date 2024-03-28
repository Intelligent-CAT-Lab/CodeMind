class main:
    import sys
    
    A, B = map(int, sys.stdin.readline().split())
    gcd = 0
    for i in range(1, max(A, B)+1):
        if A % i == 0 and B % i == 0:
            gcd = i
    lcm = A * B // gcd
    print(lcm)