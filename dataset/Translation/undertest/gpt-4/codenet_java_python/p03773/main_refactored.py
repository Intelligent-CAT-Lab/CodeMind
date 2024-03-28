class main:
    # Reading input from user
    A, B = map(int, input().split())
    
    # Calculating the answer
    ans = (A + B) - 24 if (A + B) > 23 else A + B
    
    # Printing the result
    print(ans)