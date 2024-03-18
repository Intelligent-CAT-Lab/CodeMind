def run():
    input_values = input().split()
    n = int(input_values[0])
    m = int(input_values[1])
    
    base = n * 100 + m * 1800
    print(base << m)

# Test case input
test_input = '1 1'

# Set the input for the test case
input = lambda: test_input

# Run the function with the test case
run()