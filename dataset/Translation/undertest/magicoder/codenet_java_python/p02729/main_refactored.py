class main:
    # Python code
    
    # Read input from user
    n, m = map(int, input().split())
    
    # Calculate combinations
    nComb = n * (n-1) // 2
    mComb = m * (m-1) // 2
    
    # Print the result
    print(nComb + mComb)