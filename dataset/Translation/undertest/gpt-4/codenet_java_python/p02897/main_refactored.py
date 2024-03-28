class main:
    # Read input from the user
    n = int(input())
    
    # Initialize counters
    odd = 0
    notOdd = 0
    
    # Loop through numbers from 1 to n
    for i in range(1, n + 1):
        if i % 2 == 0:
            notOdd += 1
        else:
            odd += 1
    
    # Calculate and print the result
    print(f'{odd / n:.10f}')
    
    # Example test case:
    # Input: 4
    # Expected Output: 0.5000000000