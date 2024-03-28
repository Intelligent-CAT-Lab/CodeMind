class main:
    def p03502(N):
        X = N
    
        fx = 0
    
        while(N>=10):
            fx += N%10
            N //= 10
    
        fx += N
    
        if(X%fx == 0): 
            return "Yes"
        else: 
            return "No"
    
    N = int(input())
    print(p03502(N))