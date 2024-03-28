class main:
    # Sample test case
    tail = "000"
    
    # Expected output
    print(1)
    
    # Python code
    n = len(tail)
    tailsp = tail.split()
    zero = "0"
    one = "1"
    count = 0
    for i in range(n):
        if i % 2 == 0 and tailsp[i] == zero:
            count += 1
        if i % 2 == 1 and tailsp[i] == one:
            count += 1
    n -= count
    if count > n:
        print(n)
    else:
        print(count)