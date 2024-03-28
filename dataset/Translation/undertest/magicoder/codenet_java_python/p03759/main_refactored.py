class main:
    # Python code
    
    # Read input from user
    a, b, c = map(int, input().split())
    
    # Check if difference between consecutive numbers is same
    if a - b == b - c:
        print("YES")
    else:
        print("NO")