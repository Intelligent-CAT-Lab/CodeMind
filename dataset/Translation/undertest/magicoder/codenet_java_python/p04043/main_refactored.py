class main:
    # Python code
    
    # Get input from user
    a, b, c = map(int, input().split())
    
    # Check if the input matches the expected values
    if (a == 5 and b == 5 and c == 7) or (a == 5 and b == 7 and c == 5) or (a == 7 and b == 5 and c == 5):
        print("YES")
    else:
        print("NO")