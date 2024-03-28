def solve(S):
    if len(S) == 1:
        return S

    N = [int(s) for s in S]

    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        if i > 0:
            pattern_count *= 2
            tmp_bit += "1"

    sum = 0
    for i in range(pattern_count):
        bin_str = bin(i)[2:]
        while len(bin_str) < len(tmp_bit):
            bin_str = "0" + bin_str

        add = str(N[0])
        for j in range(len(bin_str)):
            if bin_str[j] == '1':
                sum += int(add)
                add = ""
            add += str(N[j+1])

        if add:
            sum += int(add)

    return sum


# Test input
S = "125"
print(solve(S))  # Expected output: 91