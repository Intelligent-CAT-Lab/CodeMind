def max_length(s):
    current_length = 0
    length = 0
    for i in s:
        if i in ['A', 'C', 'G', 'T']:
            current_length += 1
        else:
            if current_length > length:
                length = current_length
            current_length = 0
    return max(length, current_length)

def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1
    return num

s = input()
print(max_length(s))