class main:
    # Python code
    
    # Read input
    n, x, t = map(int, input().split())
    
    # Initialize variables
    ans = 0
    tako = 0
    
    # Loop until n is greater than tako
    while n > tako:
        ans += t
        tako += x
    
    # Print the result
    print(ans)