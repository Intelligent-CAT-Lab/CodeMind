class main:
    # Read the input as integers
    n, m = map(int, input().split())
    
    # Check the conditions as per the Java code and print accordingly
    if n == 0:
        if m != 0:
            print("Impossible")
        else:
            print(0, 0)
    else:
        if m <= n:
            if m == 0:
                m = 1
            print(n, m + n - 1)
        else:
            print(m, m + n - 1)