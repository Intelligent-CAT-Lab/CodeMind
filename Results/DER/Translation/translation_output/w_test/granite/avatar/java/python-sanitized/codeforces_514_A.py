def min_number(x):
    digits = [int(d) for d in str(x)]
    min_digits = [min(d, 9-d) for d in digits]
    return int(''.join(str(d) for d in min_digits))

x = 5728
print(min_number(x))