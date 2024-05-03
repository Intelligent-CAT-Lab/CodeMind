def f(array):
    c = array	## c = [] | array = []
    array_copy = array	## array_copy = [] | array = []

    while True:
        c.append('_')	## c = []
        if c == array_copy:	## c = [] | array_copy = []
            array_copy[c.index('_')] = ''	## array_copy = [] | c = []
            break
        
    return array_copy	## array_copy = []
