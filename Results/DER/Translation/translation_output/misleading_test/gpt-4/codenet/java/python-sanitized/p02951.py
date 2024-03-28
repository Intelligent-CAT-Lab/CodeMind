def p02951():
    # Read integers from input
    a, b, c = map(int, input().split())

    # Calculate and print result according to given conditions
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

# Test the function with the given input
p02951()