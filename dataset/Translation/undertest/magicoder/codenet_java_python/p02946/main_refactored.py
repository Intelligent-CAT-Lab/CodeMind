class main:
    # Python code
    
    # Get input from user
    K, X = map(int, input().split())
    
    # Generate the sequence
    sequence = [i for i in range(X - K + 1, X + K)]
    
    # Print the sequence
    print(*sequence)