class main:
    # input two integers
    a, b = map(int, input().split())
    
    # initialize count
    count = 0
    while True:
        if a > 0 and b > 0:
            count += 1
            a -= 1
            b -= 1
        else:
            break
    
    # calculate the answer
    ans = a // 2 + b // 2
    
    # output the result
    print(count, ans)