class main:
    import sys
    
    a = int(sys.stdin.readline())
    
    a100 = a // 100
    a10 = (a - a100 * 100) // 10
    a1 = a - a100 * 100 - a10 * 10
    rev = a1 * 100 + a10 * 10 + a100
    
    if a == rev:
        print("Yes")
    else:
        print("No")