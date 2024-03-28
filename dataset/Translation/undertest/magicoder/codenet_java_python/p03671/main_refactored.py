class main:
    # Python code
    
    # Read input from user
    a, b, c = map(int, input().split())
    
    # Sort the numbers
    sum_list = [a, b, c]
    sum_list.sort()
    
    # Print the sum of the first two numbers
    print(sum_list[0] + sum_list[1])