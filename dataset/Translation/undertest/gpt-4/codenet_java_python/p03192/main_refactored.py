class main:
    # Get input from user
    string = input("Enter a string: ")
    count = 0
    
    # Count the number of '2's in the string
    for char in string:
        if char == '2':
            count += 1
    
    # Print the result
    print(count)