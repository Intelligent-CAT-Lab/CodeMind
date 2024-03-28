class main:
    # Sample test case
    a = int(input())
    s = input()
    b = int(input())
    
    # Expected output
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    else:
        c = 0
    
    print(c)