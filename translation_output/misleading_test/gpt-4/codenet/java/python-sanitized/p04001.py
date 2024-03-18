def calculate_sum_of_splits(S):
    if len(S) == 1:
        return int(S)
    
    N = [int(char) for char in S]
    pattern_count = 2 ** (len(N) - 1)

    sum_of_numbers = 0
    for i in range(pattern_count):
        bin_pattern = format(i, f"0{len(N)-1}b")
        add = str(N[0])
        
        for j, bit in enumerate(bin_pattern):
            if bit == '1':
                sum_of_numbers += int(add)
                add = ""
            add += str(N[j + 1])
        
        if add:
            sum_of_numbers += int(add)

    return sum_of_numbers

# Test case
test_input = "125"
print(calculate_sum_of_splits(test_input))  # Expected output: 91