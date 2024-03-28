class main:
    # Python code
    
    # Read input from user
    a = list(map(int, input().split()))
    
    # Check conditions
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
        print("Open")
    else:
        print("Close")