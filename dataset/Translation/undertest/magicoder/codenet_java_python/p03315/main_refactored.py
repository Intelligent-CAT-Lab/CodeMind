class main:
    # Python code
    
    def count_plus_minus(input_string):
        num = 0
        for c in input_string:
            if c == '+':
                num += 1
            else:
                num -= 1
        return num
    
    # Test input
    print(count_plus_minus("+-++"))