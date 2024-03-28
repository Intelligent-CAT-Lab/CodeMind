class main:
    x = int(input())
    
    new_number_list = []
    
    # Using string manipulation for simplicity
    x_str = str(x)
    length = len(x_str)
    
    for i in range(length - 1, -1, -1):  # Loop through the number from end to start
        r = int(x_str[i])
        if 9 - r < r:
            if i == 0 and 9 - r == 0:  # If it's the first digit and 9-r is 0, use r
                new_number_list.insert(0, r)
            else:
                new_number_list.insert(0, 9 - r)
        else:
            new_number_list.insert(0, r)
    
    # Construct the new number
    new_number = int(''.join(map(str, new_number_list)))
    
    print(new_number)