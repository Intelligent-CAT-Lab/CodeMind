class main:
    # Sample test case
    H = -3
    R = 3
    
    # Expected output
    print(0)
    
    # Python code
    while True:
        try:
            H = int(input())
            R = int(input())
            break
        except ValueError:
            pass
    
    if H < 0 and abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)