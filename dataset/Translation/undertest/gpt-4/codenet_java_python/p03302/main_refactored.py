class main:
    # Input
    a, b = map(int, input().split())
    
    # Conditional logic to check the sum and product
    if a + b == 15:
        print("+")
    elif a * b == 15:
        print("*")
    else:
        print("x")