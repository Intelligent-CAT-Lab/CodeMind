class main:
    # Read input from the user
    input_str = input()
    input_list = input_str.split(" ")
    m = int(input_list[0])
    f = int(input_list[1])
    b = int(input_list[2])
    
    # Perform the checks and print the corresponding output
    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")