while True:
    try:
        H, R = map(int, input().split())
        
        if H < 0 and abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)
    except EOFError:
        break