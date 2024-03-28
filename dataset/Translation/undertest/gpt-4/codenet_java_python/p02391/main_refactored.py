class main:
    # Read the input from the user
    cmd = input()
    
    # Split the input string into a list
    x, y = map(int, cmd.split())
    
    # Compare the values and print the result
    if x == y:
        print("a == b")
    if x < y:
        print("a < b")
    if x > y:
        print("a > b")