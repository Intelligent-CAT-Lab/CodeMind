class main:
    def calculate_expression(a):
        return a + (a * a) + (a * a * a)
    
    # To mimic the test case:
    test_input = int(input())  # Assuming this is where you input "2" for the test
    print(calculate_expression(test_input))