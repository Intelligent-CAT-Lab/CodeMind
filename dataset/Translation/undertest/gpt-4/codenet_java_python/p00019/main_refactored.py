class main:
    def factorial(n):
        ans = 1
        for i in range(n, 1, -1):
            ans *= i
        return ans
    
    # Test case:
    n = 5
    print(factorial(n))