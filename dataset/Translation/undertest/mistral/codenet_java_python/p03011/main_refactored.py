class main:
    P, Q, R = map(int, input().split())
    
    if P >= Q:
        if P >= R:
            max = Q + R
        else:
            max = P + Q
    else:
        if Q >= R:
            if Q >= P:
                max = P + R
            else:
                max = Q + R
        else:
            if R >= P:
                if R >= Q:
                    max = P + Q
                else:
                    max = P + R
    
    print(max)