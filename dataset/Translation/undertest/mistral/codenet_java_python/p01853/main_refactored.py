class main:
    from sys import stdin
    
    n, m = map(int, stdin.readline().strip().split())
    
    if n % 2 == 0:
        print("0 " * (n // 2) + m * (n // 2 + 1:))
    else:
        print("0 " * (n // 2) + m * (n // 2 + 1:))