class main:
    # Sample test case
    X = 9
    Y = 45000
    
    # Initialize variables
    sum = 0
    judge = False
    a = 0
    b = 0
    c = 0
    
    # Loop through all possible values of a, b, and c
    for a in range(X+1):
        for b in range(X-a+1):
            for c in range(X-a-b):
                # Calculate the sum of a, b, and c
                sum = 10000*a + 5000*b + 1000*c
                # Check if the sum is equal to Y
                if sum == Y:
                    # Set judge to True and break out of the loops
                    judge = True
                    break
    
    # Print the values of a, b, and c if judge is True, otherwise print -1 -1 -1
    if judge:
        print(a, b, c)
    else:
        print("-1 -1 -1")