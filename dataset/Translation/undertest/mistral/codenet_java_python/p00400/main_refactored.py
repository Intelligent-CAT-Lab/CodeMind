class main:
    import sys
    
    N = int(input())
    if 'A' <= N <= 'Z':
        print(1)
    elif 'a' <= N <= 'z':
        print(2)