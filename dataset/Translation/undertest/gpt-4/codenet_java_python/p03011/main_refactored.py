class main:
    # Collect inputs from user
    P, Q, R = map(int, input().split())
    
    # Determine the maximum value as per the logic in the Java code
    if P >= Q:
        if P >= R:
            max_value = Q + R
        else:
            max_value = P + Q
    elif Q >= R:
        if Q >= P:
            max_value = P + R
        else:
            max_value = Q + R
    elif R >= P:
        if R >= Q:
            max_value = P + Q
        else:
            max_value = P + R
    
    # Output the result
    print(max_value)