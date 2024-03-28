class main:
    import sys
    
    a = int(input())
    b = int(input())
    c = int(input())
    k = int(input())
    ans = a - b
    if abs(ans) > 10**18:
        print("Unfair")
        sys.exit()
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)