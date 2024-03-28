class main:
    # Sample test input: '9 45000'
    X, Y = map(int, input().split())
    
    judge = False
    a = b = c = 0
    
    for i in range(X + 1):
        for k in range(X - i + 1):
            sum = 10000 * i + 5000 * k + 1000 * (X - i - k)
            if sum == Y:
                judge = True
                a = i
                b = k
                c = X - i - k
                break
    
    if judge:
        print(a, b, c)
    else:
        print("-1 -1 -1")