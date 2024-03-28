class main:
    from math import factorial
    
    def calculate_fact():
        # Calculate the factorial of 1510
        fact = 1
        for i in range(1, 1511):
            fact *= i
        return fact + 2
    
    fact = calculate_fact()
    
    # Read input and print output according to given logic
    try:
        while True:
            n = int(input())
            print(fact)
    
            for i in range(2, 2 + n):
                print(i)
    except EOFError:
        pass