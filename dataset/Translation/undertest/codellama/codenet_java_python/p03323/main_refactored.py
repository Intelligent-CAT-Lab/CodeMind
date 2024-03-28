class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    
    if a <= 8 and b <= 8:
        print("Yay!")
    else:
        print(":(")