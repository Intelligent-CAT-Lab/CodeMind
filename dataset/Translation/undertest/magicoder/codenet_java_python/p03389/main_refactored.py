class main:
    # Python code
    
    # Read input from user
    A, B, C = map(int, input().split())
    
    # Find the maximum number
    M = max(A, B, C)
    
    # Check if the sum of A, B, C is even or odd
    if (A+B+C)%2 == M%2:
        print((3*M-(A+B+C))//2)
    else:
        print(((3*M+3)-(A+B+C))//2)