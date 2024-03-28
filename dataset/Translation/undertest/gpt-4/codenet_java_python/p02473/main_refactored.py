class main:
    from sys import stdin
    
    # Read input
    a, b = map(int, stdin.readline().split())
    # Subtract b from a
    result = a - b
    # Print the result
    print(result)