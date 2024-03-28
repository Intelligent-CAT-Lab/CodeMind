class main:
    import math
    
    def factorial(n):
        return math.factorial(n)
    
    def p00993():
        fact = 1
        mul = 1
        for i in range(1, 1511):
            fact *= mul
            mul += 1
        fact += 2
    
        while True:
            n = int(input())
            print(factorial(fact))
            for i in range(2, 2 + n):
                print(i)
    
    p00993()