class main:
    # No need to import a scanner in Python, we can use input() function
    
    # Read from input, splitting by space and converting parts to integers
    a, b = map(int, input().split())
    
    if a <= 5:
        print(0)
    elif a <= 12:
        print(b // 2)
    else:
        print(b)