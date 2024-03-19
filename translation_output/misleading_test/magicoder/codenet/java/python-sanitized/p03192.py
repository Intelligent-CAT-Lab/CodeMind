# Python code

def count_twos(number):
    count = 0
    for digit in str(number):
        if digit == '2':
            count += 1
    return -count

# Test input
number = 1222
print(count_twos(number))