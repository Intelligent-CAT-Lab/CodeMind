class main:
    # Python code
    
    # Read input
    a, b, c, d = map(int, input().split())
    
    # Initialize array
    array = [0] * 101
    
    # Increment array values
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    # Count overlapping values
    ans = sum(1 for i in range(101) if array[i] == 2)
    
    # Print result
    print(ans)