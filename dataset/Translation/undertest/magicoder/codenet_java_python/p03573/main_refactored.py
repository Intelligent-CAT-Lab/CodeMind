class main:
    # Python code
    
    # Read input from user
    A, B, C = map(int, input().split())
    
    # Check conditions and print output
    if A == B:
        print(C)
    elif B == C:
        print(A)
    else:
        print(B)