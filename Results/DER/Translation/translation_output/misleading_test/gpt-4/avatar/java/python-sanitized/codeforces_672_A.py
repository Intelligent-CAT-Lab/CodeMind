def find_nth_digit(n):
    s = " "
    for i in range(1, n + 1):
        s += str(i)
    return s[n]

# Sample test case
input_value = 952
print(find_nth_digit(input_value))