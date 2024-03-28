class main:
    # Given input in the form of a string for the test case
    test_input = "5 2 4"
    
    # Split the input string and convert each element to an integer
    n, a, b = map(int, test_input.split())
    
    # Calculate the difference k
    k = b - a
    
    # Check the parity of k and print the result
    if k % 2 == 1:
        print("Borys")
    else:
        print("Alice")