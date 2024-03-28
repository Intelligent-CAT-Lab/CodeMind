class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    
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