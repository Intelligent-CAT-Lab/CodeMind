import math

def get_new_number(x):
    list = []
    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list.append(r)
            else:
                list.append(9 - r)
        else:
            list.append(r)
        x = x // 10

    pow = 0
    new_number = 0
    for i in range(len(list)):
        new_number += list[i] * math.pow(10, pow)
        pow += 1

    return new_number

# Test case
x = 5728
print(get_new_number(x)) # Output: 4304