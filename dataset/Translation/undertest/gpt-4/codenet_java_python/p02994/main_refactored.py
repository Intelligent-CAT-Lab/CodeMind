class main:
    # Read the input values from user
    n, l = map(int, input().split())
    
    # Create a list to store the absolute differences
    diff = []
    
    # Calculate absolute differences and add to the list
    for i in range(1, n+1):
        value = l + i - 1
        if value < 0:
            value = -value
        diff.append(value)
    
    # Find the index of the smallest difference (adding 1 as the original Java code does)
    remove_k = diff.index(min(diff)) + 1
    
    # Calculate and print the final result
    result = n*l + n*(n+1)//2 - n - (l + remove_k - 1)
    print(result)