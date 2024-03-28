class main:
    def codeforces_579_A(n):
        s = ""
        
        while n > 0:
            x = n % 2
            n //= 2
            s += str(x) + " "
        
        ans = 0
        
        for i in range(len(s)):
            if s[i] == '1':
                ans += 1
        
        return ans
    
    # Test input
    n = 9
    
    # Call the function
    result = codeforces_579_A(n)
    
    # Print the result
    print(result)