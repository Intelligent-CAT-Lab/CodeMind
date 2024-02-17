def f(array):
    zero_len = (len(array) - 1) % 3
    for i in range(zero_len):
        array[i] = '0'
    for i in range(zero_len + 1, len(array), 3):
        array[i - 1:i + 2] = ['0', '0', '0']
    return array