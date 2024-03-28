class main:
    # Get input from user
    a, b = map(int, input().split())
    
    # Check conditions and print results
    if a == 1 and b != 1:
        print("Alice")
    elif b == 1 and a != 1:
        print("Bob")
    elif a > b and a != 1 and b != 1:
        print("Alice")
    elif a < b and a != 1 and b != 1:
        print("Bob")
    elif a == b:
        print("Draw")