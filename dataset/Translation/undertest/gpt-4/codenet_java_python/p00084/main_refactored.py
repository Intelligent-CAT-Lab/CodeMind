class main:
    # Read input from user
    try:
        while True:
            str_input = input()
            # Replace punctuation with spaces
            str_input = str_input.replace('.', ' ').replace(',', ' ')
            # Split the string into tokens
            tokens = str_input.split()
            # Initialize counter for the number of words printed
            count = 0
    
            # Iterate over each token and check the length
            for token in tokens:
                n = len(token)
    
                # If the token length is within the specified range, print it
                if 3 <= n <= 6:
                    # Print a space before the token if it's not the first one
                    if count > 0:
                        print(" ", end='')
                    print(token, end='')
                    count += 1
                    
            # If at least one word was printed, move to a new line
            if count > 0:
                print()
    except EOFError:
        # End of file (or input stream), stop the loop
        pass