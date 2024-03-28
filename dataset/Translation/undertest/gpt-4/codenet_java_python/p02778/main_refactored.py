class main:
    # Taking input
    s = input()
    
    # Printing 'x' for each character in the string
    for i in range(len(s)):
        print('x', end='')
    
    # Alternatively, you can achieve the same result with a more Pythonic approach:
    # print('x' * len(s))