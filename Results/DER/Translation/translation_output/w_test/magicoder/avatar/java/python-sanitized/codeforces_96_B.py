def find_next_number(number):
    mask = 2
    while True:
        binary_str = bin(mask)[2:]
        zeros = binary_str.count('0')
        ones = binary_str.count('1')
        if zeros != ones:
            mask += 1
            continue
        binary_str = binary_str.replace('0', '4')
        binary_str = binary_str.replace('1', '7')
        value = int(binary_str, 2)
        if value > number:
            return value
        mask += 1

number = int(input())
print(find_next_number(number))