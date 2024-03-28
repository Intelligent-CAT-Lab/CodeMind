class main:
    def factorial(N):
        ans = 1
        for i in range(N, 1, -1):
            ans *= i
        return ans
    
    N = int(input())
    print(factorial(N))