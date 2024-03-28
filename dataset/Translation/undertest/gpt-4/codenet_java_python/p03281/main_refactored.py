class main:
    n = int(input())
    ans = 0
    
    for i in range(1, n + 1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n + 1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
                # print(i) # for debugging - to check the current value
    
    print(ans)