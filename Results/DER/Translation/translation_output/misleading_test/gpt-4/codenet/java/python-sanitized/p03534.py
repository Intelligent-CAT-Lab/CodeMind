def check_abc_counts(input_str):
    abc_counts = [0] * 3
    for char in input_str:
        if char in 'abc':
            abc_counts['abc'.index(char)] += 1

    abc_counts.sort()

    return 'YES' if (abc_counts[1] - abc_counts[0] < 2) and (abc_counts[2] - abc_counts[0] < 2) else 'NO'


# Sample test case
input_str = input()
print(check_abc_counts(input_str))