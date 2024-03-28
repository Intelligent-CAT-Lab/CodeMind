class main:
    def solve(n):
        ans = 0
    
        #25cent
        ans += n//25
        n %= 25
    
        #10cent
        ans += n//10
        n %= 10
    
        #5cent
        ans += n//5
        n %= 5
    
        #1cent
        ans += n
    
        return ans
    
    # Test input
    n = 100
    
    # Call the function
    print(solve(n))