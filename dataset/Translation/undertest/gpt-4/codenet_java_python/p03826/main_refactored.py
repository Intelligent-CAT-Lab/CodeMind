class main:
    # Read space-separated integers from input
    a, b, c, d = map(int, input().split())
    
    # Calculate the products
    product1 = a * b
    product2 = c * d
    
    # Print the maximum of the two products
    print(max(product1, product2))