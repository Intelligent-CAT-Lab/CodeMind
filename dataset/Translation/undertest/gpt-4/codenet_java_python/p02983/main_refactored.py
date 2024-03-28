class main:
    def solve(L, R):
        R -= L
        L %= 2019
        R += L
    
        res = 2019  # max value
    
        if R - L > 2019:
            print(0)
            return
    
        for i in range(L, R + 1):
            for j in range(L, i):
                res = min(res, (i * j) % 2019)
        
        print(res)
    
    # Sample test case
    test_input = "2020 2040"
    L, R = map(int, test_input.split())
    solve(L, R)