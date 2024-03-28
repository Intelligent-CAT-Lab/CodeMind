class main:
    x, y = map(int, input().split())  # Get two integers from the input
    
    crane = -(y / 2) + 2 * x
    turtle = x - crane
    
    # Check if the calculated number of cranes and turtles is valid
    #