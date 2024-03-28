class main:
    def fibonacci(n):
        num = [0] * 100
        num[0] = 2
        num[1] = 1
        for i in range(2, n+1):
            num[i] = num[i-1] + num[i-2]
        return num[n]
    
    n = int(input())
    print(fibonacci(n))