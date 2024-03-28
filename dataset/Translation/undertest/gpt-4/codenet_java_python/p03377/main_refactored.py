class main:
    # Read the input from the user
    a, b, x = map(int, input().split())
    
    # Check if the conditions are met and print the corresponding output
    if a + b >= x and a <= x:
        print("YES")
    else:
        print("NO")