class main:
    # Read input from the user
    n = int(input())
    
    count = 0
    
    # Perform the same logic as in the Java code
    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    
    # Print the result
    print(count)