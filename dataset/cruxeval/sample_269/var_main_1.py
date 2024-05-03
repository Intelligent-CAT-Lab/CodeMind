def f(array):
    zero_len = (len(array) - 1) % 3	## zero_len = CLRJ | array = CLRJ
    for i in range(zero_len):	## i = CLRJ | zero_len = CLRJ
        array[i] = '0'	## array = CLRJ | i = CLRJ
    for i in range(zero_len + 1, len(array), 3):	## i = CLRJ | zero_len = CLRJ | array = CLRJ
        array[i - 1:i + 2] = ['0', '0', '0']
    return array	## array = CLRJ
