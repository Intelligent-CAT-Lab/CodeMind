def f(array):
    zero_len = (len(array) - 1) % 3	## {"zero_len" : '',"array" : ''}
    for i in range(zero_len):	## {"i" : '',"zero_len" : ''}
        array[i] = '0'	## {"array" : '',"i" : ''}
    for i in range(zero_len + 1, len(array), 3):	## {"i" : '',"zero_len" : '',"array" : ''}
        array[i - 1:i + 2] = ['0', '0', '0']
    return array	## {"array" : ''}
