class main:
    #input
    N = int(input())
    
    #calculation
    ans = 1
    for i in range(N, 1, -1):
        ans *= i
    
    #output
    print(ans)