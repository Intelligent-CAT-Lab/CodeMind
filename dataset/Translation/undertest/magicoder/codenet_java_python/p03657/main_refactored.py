class main:
    # Python code
    
    # Get input from user
    a, b = map(int, input().split())
    
    # Check if a, b or their sum is divisible by 3
    if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
        print("Possible")
    else:
        print("Impossible")