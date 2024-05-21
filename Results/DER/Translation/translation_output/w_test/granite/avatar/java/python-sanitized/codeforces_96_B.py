def convert_to_lucky(number):
    mask = 2
    while True:
        binary_string = bin(mask)[2:]
        num_zeros = binary_string.count('0')
        num_ones = binary_string.count('1')
        if num_zeros!= num_ones:
            mask += 1
            continue
        lucky_number = binary_string.replace('0', '4').replace('1', '7')
        if int(lucky_number) >= number:
            return int(lucky_number)
        mask += 1

number = int(input())
print(convert_to_lucky(number))