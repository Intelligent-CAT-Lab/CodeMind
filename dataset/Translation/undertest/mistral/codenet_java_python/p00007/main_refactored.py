class main:
    # Sample test case
    weeks = 5
    
    # Expected output
    expected_output = 130000
    
    # Actual output
    actual_output = debt_hell(100000, weeks)
    
    # Check if the actual output is equal to the expected output
    if actual_output == expected_output:
        print("Test passed!")
    else:
        print("Test failed!")
    
    
    def debt_hell(total, weeks):
        sum = total
        for i in range(weeks):
            yield = sum * 0.05
            if yield % 1000 == 0:
                sum += yield
            else:
                sum += (int(yield / 1000 + 1) * 1000)
        return sum