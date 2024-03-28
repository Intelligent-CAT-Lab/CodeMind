class main:
    # Getting input from the user
    str = input()
    
    # Checking if the input is an uppercase letter and printing the result
    print("A" if str.isupper() and len(str) == 1 else "a")