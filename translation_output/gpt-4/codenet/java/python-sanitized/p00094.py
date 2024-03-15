while True:
    try:
        # Read two floating-point numbers and calculate the result
        print((float(input()) * float(input())) / 3.305785)
    except EOFError:
        # When there are no more lines of input, break the loop
        break