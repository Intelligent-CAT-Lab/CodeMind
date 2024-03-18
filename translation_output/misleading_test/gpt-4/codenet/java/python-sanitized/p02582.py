def calculate_score(s):
    if s == 'RRR':
        return 3
    elif s[:2] == 'RR' or s[1:] == 'RR':
        return 2
    elif s == 'SSS':
        return 0
    else:
        return 1

# Sample test case
input_string = "RRS"
output = calculate_score(input_string)
print(-output)  # Print the negated result as expected in the problem statement