class main:
    # Python code
    
    # Read input
    input_values = list(map(int, input().split()))
    
    # Initialize variables
    answer = 0
    count = [0]*5
    
    # Iterate over the input values
    for i in range(5):
        x = input_values[i]
        count[i] += x
        
        # Check if the count is 0
        if count[i] == 0:
            answer = i
    
    # Print the answer
    print(answer + 1)