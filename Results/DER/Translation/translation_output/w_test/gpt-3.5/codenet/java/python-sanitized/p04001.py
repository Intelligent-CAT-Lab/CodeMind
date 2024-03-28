def calculate_sum(S):
    if len(S) == 1:
        return int(S)

    N = [int(char) for char in S]
    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        if i > 0:
            pattern_count *= 2
            tmp_bit += "1"

    sum_val = 0
    for i in range(pattern_count):
        bin_str = bin(i)[2:].zfill(len(tmp_bit))
        add = str(N[0])
        for j in range(len(bin_str)):
            if bin_str[j] == '1':
                sum_val += int(add)
                add = ""
            add += str(N[j + 1])
        if len(add) > 0:
            sum_val += int(add)

    return sum_val

# Test the function with the given sample input
S = "125"
result = calculate_sum(S)
print(result)