class main:
    s = input().strip()
    c = sum(int(char) for char in s)
    
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")
    
    # Test input
    # 123456789
    
    # Expected output
    # Yes