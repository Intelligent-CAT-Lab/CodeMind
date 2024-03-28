class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    print(bin(a & b)[2:].zfill(32)[::-1])
    print(bin(a | b)[2:].zfill(32)[::-1])
    print(bin(a ^ b)[2:].zfill(32)[::-1])