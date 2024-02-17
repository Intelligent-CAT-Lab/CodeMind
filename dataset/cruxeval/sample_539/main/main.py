def f(array):
    c = array
    array_copy = array

    while True:
        c.append('_')
        if c == array_copy:
            array_copy[c.index('_')] = ''
            break
        
    return array_copy