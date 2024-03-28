def replace_digits(n):
    mask = 2
    while True:
        binary_mask = bin(mask)[2:]
        if binary_mask.count('0') == binary_mask.count('1'):
            binary_mask = binary_mask.replace('0', '4')
            binary_mask = binary_mask.replace('1', '7')
            if int(binary_mask) > n:
                return int(binary_mask)
        mask += 1

print(replace_digits(77777777))