class main:
    a,b = map(int,input().split())
    print(bin(a&b)[2:].zfill(32))
    print(bin(a|b)[2:].zfill(32))
    print(bin(a^b)[2:].zfill(32))