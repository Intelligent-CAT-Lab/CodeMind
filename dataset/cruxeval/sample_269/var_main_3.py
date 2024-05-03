def f(array):
    zero_len = (len(array) - 1) % 3	## <state>zero_len = CLRJ | array = CLRJ</state>
    for i in range(zero_len):	## <state>i = CLRJ | zero_len = CLRJ</state>
        array[i] = '0'	## <state>array = CLRJ | i = CLRJ</state>
    for i in range(zero_len + 1, len(array), 3):	## <state>i = CLRJ | zero_len = CLRJ | array = CLRJ</state>
        array[i - 1:i + 2] = ['0', '0', '0']
    return array	## <state>array = CLRJ</state>
